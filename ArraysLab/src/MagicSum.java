import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number
 */
public class MagicSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = Arrays.stream(inp.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(inp.nextLine());
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (n==(arr[i]+arr[j])){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
}