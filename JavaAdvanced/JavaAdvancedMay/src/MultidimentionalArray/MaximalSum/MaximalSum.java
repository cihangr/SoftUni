package MultidimentionalArray.MaximalSum;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a rectangular integer matrix of size N x M and finds the square 3 x 3 with a maximal sum of its elements. 
Input
On the first line, you will receive the rows N and columns M. 
On the next N lines, you will receive each row with its elements.
Print the elements of the 3 x 3 square as a matrix, along with their sum. See the format of the output below.

>>>>>INPUT
4 5
1 5 5 2 4
2 1 4 14 3
3 7 11 2 8
4 8 12 16 4
>>>>>OUTPUT
Sum = 75
1 4 14
7 11 2
8 12 16

>>>>>INPUT
5 6
1 0 4 3 1 1
1 3 1 3 0 4
6 4 1 2 5 6
2 2 1 5 4 1
3 3 3 6 0 5
>>>>>OUTPUT
Sum = 34
2 5 6
5 4 1
6 0 5
*/
public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int row = Integer.parseInt(line.split(" ")[0]);
        int col = Integer.parseInt(line.split(" ")[1]);
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int total = 0, newI=Integer.MIN_VALUE, newJ=Integer.MIN_VALUE;
        if (row >= 3 && col >= 3) {
            for (int i = 0; i < matrix.length-2; i++) {
                for (int j = 0; j < matrix[i].length-2; j++) {
                    int newTotal = findTotal(matrix,i,j);
                    if (newTotal > total) {
                        total = newTotal;
                        newI = i;
                        newJ = j;
                    }
                }
            }
            System.out.println("Sum = " + total);
            for (int i = newI; i < newI+3; i++) {
                for (int j = newJ; j < newJ+3; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println(0);
        }

    }
    private static int findTotal(int[][] matrix,int row,int col) {
        int sum = 0;
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
