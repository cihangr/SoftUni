package MultidimentionalArray.MatrixOfPalindromes;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program to generate the following matrix of palindromes of 3 letters with r rows and c columns
like the one in the examples below.
Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’, …
Columns + rows define the middle letter:
column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …
Input
The numbers r and c stay in the first line at the input.
 r and c are integers in the range [1…26].
 r + c ≤ 27

>>>>>INPUT
4 6
>>>>>OUTPUT
aaa aba aca ada aea afa
bbb bcb bdb beb bfb bgb
ccc cdc cec cfc cgc chc
ddd ded dfd dgd dhd did

>>>>>INPUT
3 2
>>>>>OUTPUT
aaa aba
bbb bcb
ccc cdc

>>HINT<<
Use two nested loops to generate the matrix.
Print the matrix row by row in a loop.
Don't forget to pack everything in methods.
*/
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Take the row and col numbers
        String input = scanner.nextLine();
        int row = Integer.parseInt(input.split(" ")[0]);
        int col = Integer.parseInt(input.split(" ")[1]);

        //create empty matrix
        String[][] matrix = new String[row][col];

        //change the matrix with method
        generateMatrix(matrix);
        //print the matrix
        printMatrix(matrix);

    }
    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void generateMatrix(String[][] matrix) {
        int asciiValue = 97;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char firstLetter = (char) (asciiValue+i);
                char secondLetter = (char) (asciiValue+i+j);
                char thirdLetter = (char) (asciiValue+i);
                matrix[i][j]= String.valueOf(firstLetter) + String.valueOf(secondLetter) + String.valueOf(thirdLetter);
            }
        }
    }
}
