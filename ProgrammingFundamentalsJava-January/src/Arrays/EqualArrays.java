package Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
@CIHAN GUR

Read two arrays and print on the console whether they are
identical or not. Arrays are identical if their elements
are equal. If the arrays are identical, find the sum of
the first one and print on the console the following message:
"Arrays are identical. Sum: {sum}", otherwise find the first
index where the arrays differ and print on the console following
message: "Arrays are not identical. Found difference at {index} index."

 */
public class EqualArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr1 = Arrays.stream(inp.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr2 = Arrays.stream(inp.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxArrTotal = 0;
        int[] maxArr;
        int[] smallArr;

        if (arr1.length >= arr2.length) {
            maxArr = arr1;
            smallArr = new int[maxArr.length];
            for (int i=0; i<arr2.length; i++){
                smallArr[i]=arr2[i];
            }
        } else {
            maxArr = arr2;
            smallArr = new int[maxArr.length];
            for (int i=0; i<arr1.length; i++){
                smallArr[i]=arr1[i];
            }
        }

        for (int j = 0; j < maxArr.length; j++) {
            maxArrTotal += maxArr[j];
            if (maxArr[j] != smallArr[j]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", j);
                return;
            }
        }

        System.out.printf("Arrays are identical. Sum: %d", maxArrTotal);
    }
}
