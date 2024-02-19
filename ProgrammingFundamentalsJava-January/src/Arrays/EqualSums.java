import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that determines if an element exists in the array such that the sum of the elements
on its left is equal to the sum of the elements on its right. If there are no elements to the
left/right, their sum is considered to be 0. Print the index that satisfies the required condition
or "no" if there is no such index.

 */
public class EqualSums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = Arrays.stream(inp.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int position = 0; position < arr.length; position++) {
            int currentPosition = arr[position];
            int leftNumbers = 0;
            int rightNumbers = 0;
            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftNumbers+=arr[leftPosition];
            }
            for (int rightPosition = position+1; rightPosition < arr.length; rightPosition++) {
                rightNumbers+=arr[rightPosition];
            }
            if (leftNumbers==rightNumbers){
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");

    }
}