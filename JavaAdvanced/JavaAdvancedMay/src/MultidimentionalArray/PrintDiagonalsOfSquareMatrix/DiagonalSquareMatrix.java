package MultidimentionalArray.PrintDiagonalsOfSquareMatrix;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a matrix from the console. Then print the diagonals.
The matrix will always be square. On the first line, you read a single integer N the matrix size.
Then on each line N elements. The first diagonal should always start with the element at
the first row and col. The second diagonal should start with the element at the last row and first col.

INPUT
3
1 2 3
1 2 3
1 2 3
OUTPUT
1 2 3
1 2 3

INPUT
4
1 2 3 2
1 1 2 4
1 2 1 4
2 2 3 1
OUTPUT
1 1 1 1
2 2 2 2

*/
public class DiagonalSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = readArray(scanner);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        int row = n -1;
        int col = 0;
        while (row >= 0 && col < n) {
            System.out.print(matrix[row][col]+" ");
            row--;
            col++;
        }
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
