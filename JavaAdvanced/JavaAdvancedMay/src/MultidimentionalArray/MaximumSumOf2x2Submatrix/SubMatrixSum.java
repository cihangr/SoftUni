package MultidimentionalArray.MaximumSumOf2x2Submatrix;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a matrix from the console. Then find the biggest sum of a 2x2 submatrix.
Print the submatrix and its sum.
On the first line, you will get the matrix dimensions in the format "{rows, columns}".
On the next lines, you will get the elements for each row separated by a comma.

INPUT
3, 6
7, 1, 3, 3, 2, 1
1, 3, 9, 8, 5, 6
4, 6, 7, 9, 1, 0
OUTPUT
9 8
7 9
33

INPUT
2, 4
10, 11, 12, 13
14, 15, 16, 17
OUTPUT
12 13
16 17
58

*/
public class SubMatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimension = readArray(scanner);
        int row = dimension[0];
        int col = dimension[1];
        int[][] matrix = new int[row][col];
        int[][] maxMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int[] arr = readArray(scanner);
            matrix[i] = arr;
        }

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < col - 1; j++) {
                int leftTop = matrix[i][j];
                int rightTop = matrix[i][j+1];
                int leftBottom = matrix[i+1][j];
                int rightBottom = matrix[i+1][j+1];
                int sum = leftTop + rightTop + rightBottom +leftBottom;
                if (sum > maxSum) {
                    maxSum = sum;
                    maxMatrix[0][0] = leftTop;
                    maxMatrix[0][1] = rightTop;
                    maxMatrix[1][0] = leftBottom;
                    maxMatrix[1][1] = rightBottom;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(maxMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(maxSum);



    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}
