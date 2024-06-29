package MultidimentionalArray.SumMatrixElements;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a matrix from the console and prints:
The count of rows
The count of columns
The sum of all matrix's elements
On the first line, you will get the matrix dimensions in the format "{rows, columns}".
On the next lines, you will get the elements for each row separated by a comma.

INPUT
3, 6
7, 1, 3, 3, 2, 1
1, 3, 9, 8, 5, 6
4, 6, 7, 9, 1, 0
OUTPUT
3
6
76

INPUT
2, 4
10, 11, 12, 13
14, 15, 16, 17
OUTPUT
2
4
108

*/
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int row = dimension[0];
        int col = dimension[1];
        int[][] matrix = new int[row][col];
        int totalSum = 0;
        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(totalSum);
    }
}
