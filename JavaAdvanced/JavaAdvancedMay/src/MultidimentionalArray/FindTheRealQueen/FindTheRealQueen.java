package MultidimentionalArray.FindTheRealQueen;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads (8 x 8) matrix of characters from the console.
The matrix represents a chessboard with figures on it. The figures can be
- queens as char 'q' or any other ASCII symbol. There will be more than
one queen, but only one queen will have a valid position, which is not attacked
by any other queen and does not attack any other queen. In another word, in the
way of the valid queen, there are no other queens, but there may be any other
ASCII symbol. Your task is to read the chessboard and find the position of the
valid queen. According to chess rules, the queen can attack all the cells in
horizontal verticals and both diagonals, which cross the queen position.

>>>>>INPUT
p a p a p a p a
p a p a p a p a
p a q a p a q a
p a p a p a p a
p a p q p a p a
p a p a p a p a
p a q a p a q a
p a p a p a p a
>>>>>OUTPUT
4 3

>>>>>INPUT
1 q q q 1 q q q
q 1 q q 1 q q 1
q q 1 q 1 q 1 q
q q q 1 1 1 q q
1 1 1 1 q 1 1 1
q q q 1 1 1 q q
q q 1 q 1 q 1 q
q 1 q q 1 q q 1
>>>>>OUTPUT
4 4
*/
public class FindTheRealQueen {
    public static void main(String[] args) {
        //scan
        Scanner scanner = new Scanner(System.in);
        //describe the 8x8 matrix
        String[][] matrix = new String[8][8];
        //enter the values and our chessboard will be ready.
        for (int i = 0; i < 8; i++) {
            String[] row = scanner.nextLine().split(" ");
            matrix[i] = row;
        }
        //check the queens
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j].equals("q")) {
                    if (isQueenReal(matrix,i,j)){
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
    }

    private static boolean isQueenReal(String[][] chessboard,int row,int col) {
        // Check rows and columns
        for (int i = 0; i < 8; i++) {
            if (i != row && chessboard[row][i].equals("q")) {
                return false;
            }
            if (i != col && chessboard[i][col].equals("q")) {
                return false;
            }
        }

        // Check diagonals
        for (int i = 1; i < Math.min(row, col) + 1; i++) {
            if (chessboard[row - i][col - i].equals("q")) {
                return false;
            }
            if (chessboard[row + i][col + i].equals("q")) {
                return false;
            }
        }
        for (int i = 1; i < Math.min(7 - row, col) + 1; i++) {
            if (chessboard[row + i][col - i].equals("q")) {
                return false;
            }
            if (chessboard[row - i][col + i].equals("q")) {
                return false;
            }
        }

        return true;
    }
}
///ITS NOT FINISHED