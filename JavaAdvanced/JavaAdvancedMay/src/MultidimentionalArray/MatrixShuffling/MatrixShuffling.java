package MultidimentionalArray.MatrixShuffling;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program which reads a string matrix from the console and performs certain operations with its elements.
User input is provided similarly to the problems above – first, you read the dimensions and then the data.
Your program should then receive commands in the format: "swap row1 col1 row2c col2" where
row1, row2, col1, col2 are coordinates in the matrix. For a command to be valid, it should start with the
"swap" keyword along with four valid coordinates (no more, no less). You should swap the values at the given
coordinates (cell [row1, col1] with cell [row2, col2]) and print the matrix at each step (this you'll be able
to check if the operation was performed correctly).
If the command is not valid (doesn't contain the keyword "swap", has fewer or more coordinates entered, or
the given coordinates do not exist), print "Invalid input!" and move on to the next command. Your program
should finish when the string "END" is entered.

>>>>>INPUT
2 3
1 2 3
4 5 6
swap 0 0 1 1
swap 10 9 8 7
swap 0 1 1 0
END
>>>>>OUTPUT
5 2 3
4 1 6
Invalid input!
5 4 3
2 1 6

>>>>>INPUT
1 2
Hello World
0 0 0 1
swap 0 0 0 1
swap 0 1 0 0
END
>>>>>OUTPUT
Invalid input!
World Hello
Hello World

*/
public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeOfMatrix = scanner.nextLine();
        int rows = Integer.parseInt(sizeOfMatrix.split(" ")[0]);
        int cols = Integer.parseInt(sizeOfMatrix.split(" ")[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line.split(" ")[j];
            }
        }

        String shuffle = scanner.nextLine();
        while(!shuffle.equals("END")){
                String command = shuffle.split(" ")[0];
            if (!command.equals("swap")){
                System.out.println("Invalid input!");
            }  else {
                int firstRow = Integer.parseInt(shuffle.split(" ")[1]);
                int firstCol = Integer.parseInt(shuffle.split(" ")[2]);
                int secondRow = Integer.parseInt(shuffle.split(" ")[3]);
                int secondCol = Integer.parseInt(shuffle.split(" ")[4]);
                if (firstRow>matrix.length || firstRow<0 ||
                        secondRow>matrix.length || secondRow<0 ||
                        firstCol>matrix[0].length || firstCol<0 ||
                        secondCol>matrix[0].length || secondCol<0){
                    System.out.println("Invalid input!");
                } else {
                    String takeValue = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = takeValue;
                    printMatrix(matrix);
                }
            }
            shuffle = scanner.nextLine();
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
