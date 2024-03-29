package Arrays;

import java.util.Scanner;

/*
@CIHAN GUR

The triangle may be constructed in the following manner: In row 0 (the topmost row), there
is a unique nonzero entry 1. Each entry of each subsequent row is constructed by adding the
number above and to the left with the number above and to the right, treating blank entries
as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth
row. If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle

Print each row element, separated with whitespace.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        int arrLength=1;
        for (int row = 0; row < n; row++) {
            int[] arr = new int[arrLength];
            arr[row]=1;
            for(int j=0;j<=row;j++)    //To find the Pascal triangle element
            {
                System.out.print(arr[row]+ " ");    //Print the array elements
                arr[row] = arr[row] * (row - j) / (j + 1);   //Store the pascal triangle elements in an array
            }
            System.out.println();
            arrLength++;
        }
    }
}