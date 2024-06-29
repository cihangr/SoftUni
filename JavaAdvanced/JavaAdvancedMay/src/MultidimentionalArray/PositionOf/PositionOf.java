package MultidimentionalArray.PositionOf;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a matrix of integers from the console, then a number, and prints
all the positions at which that number appears in the matrix.
The matrix definition on the console will contain a line with two positive integer
numbers R and C – the number of rows and columns in the matrix – followed by R lines,
each containing C numbers (separated by spaces), representing each row of the matrix.
The number you will need to find the positions will be entered on a single line after the matrix.
You should print each position on a single line – first print the row, then the column at which
the number appears.
If the number does not appear in the matrix, print "not found".

INPUT
2 3
1 2 3
4 2 2
2
OUTPUT
0 1
1 1
1 2

INPUT
2 3
1 -2 -3
4 -5 6
5
OUTPUT
not found
*/
public class PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s++")).mapToInt(Integer::parseInt).toArray();
        int row = dimension[0];
        int col = dimension[1];
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s++")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        int searchNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == searchNumber) {
                    isFound = true;
                    System.out.println(i+" "+j);
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }


    }
}
