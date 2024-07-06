package MultidimentionalArray.FillTheMatrix;

import java.util.Scanner;

/*
@CIHAN GUR

Filling a matrix regularly (top to bottom and left to right) is boring. Write two methods that fill a size
N x N matrix in two different patterns. Both patterns are described below:

Pattern A
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16

Pattern B
1 8 9 16
2 7 10 15
3 6 11 14
4 5 12 13

>>>>>INPUT
3, A
>>>>>OUTPUT
1 4 7
2 5 8
3 6 9

>>>>>INPUT
3, B
>>>>>OUTPUT
1 6 7
2 5 8
3 4 9

>>HINT<<
Make a different method for each pattern.
Make a method for printing the matrix.
*/
public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];
        switch (pattern){
            case "A" : generateMatrixA(matrix); break;
            case "B" : generateMatrixB(matrix); break;
        }
        print(matrix);
    }
    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void generateMatrixB(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col%2==0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            } else {
                for (int row = matrix.length-1; row >= 0; row--) {
                   matrix[row][col] = counter++;
                }
            }
        }


    }
    private static void generateMatrixA(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col%2==0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            } else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            }
        }
    }
}
