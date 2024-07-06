package MultidimentionalArray.DiagonalDifference;
/*
@CIHAN GUR

Write a program that finds the difference between the sums of the square matrix diagonals (absolute value).
11 2 4
4 5 6
10 8 -12
Primary Diagonal = 11 + 5 + (-12) = 4
Secondary Diagonal = 10 + 5 + 4 = 19
|4-19| = 15
Input
The first line holds a number n – the size of matrix.
The next n lines hold the values for every row – n numbers separated by a space.

>>>>>INPUT
3
11 2 4
4 5 6
10 8 -12
>>>>>OUTPUT
15

>>>>>INPUT
4
-7 14 9 -20
3 4 9 21
-14 6 8 44
30 9 7 -14
>>>>>OUTPUT
34

>HINT<
Use a single loop i = [1 … n] to sum the diagonals.
The primary diagonal holds all cells {row, col} where row == col == i.
The secondary diagonal holds all cells {row, col} where row == i and col == n-1-i.
*/

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int result = Math.abs(primaryDiagonal(matrix)-secondaryDiagonal(matrix));
        System.out.println(result);
    }
    private static int primaryDiagonal(int[][] matrix) {
        int totalPrimaryDiag = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    totalPrimaryDiag += matrix[i][j];
                }
            }
        }
        return totalPrimaryDiag;
    }
    private static int secondaryDiagonal(int[][] matrix) {
        int totalSecondaryDiag = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length-1; j>=0; j--) {
                if (i==matrix.length-1-j) {
                    totalSecondaryDiag += matrix[i][j];
                }
            }
        }
        return totalSecondaryDiag;
    }
}
