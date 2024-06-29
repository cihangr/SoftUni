package MultidimentionalArray.CompareMatrices;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads two integer matrices (2D arrays) from the console and compares
them element by element. For better code reusability, you could make the comparison in a
method that returns true if they are equal and false if not.
Each matrix definition on the console will contain a line with a positive integer number R
– the number of rows in the matrix and C – the number of columns – followed by R lines
containing the C numbers, separated by spaces (each line will have an equal amount of numbers.
The matrices will have at most 10 rows and at most 10 columns.
Print "equal" if the matrices match and "not equal" if they don't match.


INPUT
2 3
1 2 3
2 1 3
2 3
1 2 3
2 1 3
OUTPUT
equal

INPUT
2 3
1 2 3
4 5 6
2 2
1 3
4 5
OUTPUT
not equal
*/
public class CompareMatrices {
    public static void main(String[] args) {
        //starting to scan
        Scanner scanner = new Scanner(System.in);

        //first line is for describe dimensions of the matrix
        int[] dimensions = readArray(scanner);
        int row = dimensions[0];
        int col = dimensions[1];

        //now we have size and we can give dimensions to matrix
        int[][] firstMatrix = new int[row][col];
        //next lines for entering the matrix values.
        for (int i = 0; i < row; i++) {
            int[] arr = readArray(scanner);
            firstMatrix[i] = arr;
        }

        //second matrix dimensions.
        int[] dimensions2 = readArray(scanner);
        int row2 = dimensions2[0];
        int col2 = dimensions2[1];

        //same job for entering the values.
        int[][] secondMatrix = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            int[] arr2 = readArray(scanner);
            secondMatrix[i] = arr2;
        }

        //checking the equality with matrices.
        if (isEqual(firstMatrix,secondMatrix)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }


    //Reading Array from string.
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    //Checking the equality of the whole matrices
    static boolean isEqual(int[][] firstMatrix, int[][] secondMatrix) {
        //check row number equality!
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        //check column number equality!
        if (firstMatrix[0].length != secondMatrix[0].length) {
            return false;
        }
        //check values are equal or not!
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

