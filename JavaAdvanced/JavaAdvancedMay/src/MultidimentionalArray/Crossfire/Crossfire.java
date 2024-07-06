package MultidimentionalArray.Crossfire;

import java.util.Scanner;

/*
@CIHAN GUR

You will receive two integers, which represent the dimensions of a matrix. Then, you must fill the matrix with
 increasing integers starting from 1, and continuing on every row, like this:
first row: 1, 2, 3, …, n second row: n + 1, n + 2, n + 3, …, n + n third row: 2 * n + 1, 2 * n + 2, …, 2 * n + n
You will also receive several commands in the form of 3 integers separated by a space. Those 3 integers will represent
 a row in the matrix, a column, and a radius. You must then destroy the cells, which correspond to those arguments
 cross-like.
Destroying a cell means that that cell becomes completely nonexistent in the matrix. Destroying cells cross-like
means that you form a cross figure with a center point - equal to the cell with coordinates – the given row and
column, and lines with length equal to the given radius. See the examples for more info.
The input ends when you receive the command "Nuke it from orbit". When that happens, you must print what has
remained from the initial matrix.
Input
On the first line, you will receive the dimensions of the matrix. You must then fill the matrix according to
those dimensions.
On the next several lines, you will receive 3 integers separated by a single space representing the row, col,
and radius. It would help if you then destroyed cells according to those coordinates.
When you receive the command "Nuke it from orbit" the input ends.
Output
The output is simple. You must print what is left from the matrix.
Every row must be printed on a new line, and every column of a row - be separated by a space.
Constraints
The dimensions of the matrix will be integers in the range [2, 100].
The given rows and columns will be valid integers in the range [-231 + 1, 231 - 1].
 The radius will be in the range [0, 231 - 1].
Allowed time/memory: 250ms/16MB.


>>>>>INPUT
5 5
3 3 2
4 3 2
Nuke it from orbit
>>>>>OUTPUT
1 2 3 4 5
6 7 8 10
11 12 13
16
21

>>>>>INPUT
5 5
4 4 4
Nuke it from orbit
>>>>>OUTPUT
1 2 3 4
6 7 8 9
11 12 13 14
7 18 19
*/
public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //enter the matrix values and create the matrix
        String matrixValues = scanner.nextLine();
        int rows = Integer.parseInt(matrixValues.split(" ")[0]);
        int cols = Integer.parseInt(matrixValues.split(" ")[1]);
        String[][] matrix = new String[rows][cols];
        int counter =1;
        for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                 matrix[i][j] = String.valueOf(counter);
                 counter++;
            }
        }
        //take the nuke location and radius
        String nukeInfo = scanner.nextLine();
        while(!nukeInfo.equals("Nuke it from orbit")){
            int R = Integer.parseInt(nukeInfo.split(" ")[0]);
            int C = Integer.parseInt(nukeInfo.split(" ")[1]);
            int radius = Integer.parseInt(nukeInfo.split(" ")[2]);

            blow(matrix,R,C,radius);

            nukeInfo = scanner.nextLine();
        }

        printMatrix(matrix);

    }
    private static void blow(String[][] matrix, int R, int C, int radius) {
        matrix[R][C] = " ";
        for (int r = 0; r <= radius; r++) {
            if (C-r>=0){
                matrix[R][C-r]=" ";
            }
            if (C+r<=matrix[0].length-1){
                matrix[R][C+r]=" ";
            }
            if(R-r>=0){
                matrix[R-r][C]=" ";
            }
            if(R+r<=matrix.length-1){
                matrix[R+r][C]=" ";
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (!matrix[i][j].equals(" ")){

                }
            }
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
