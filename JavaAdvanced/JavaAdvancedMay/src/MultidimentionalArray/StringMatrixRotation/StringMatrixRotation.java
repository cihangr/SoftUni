package MultidimentionalArray.StringMatrixRotation;

import java.util.*;

/*
@CIHAN GUR

You are given a sequence of text lines. Assume these text lines form a matrix of characters
(pad the missing positions with spaces to build a rectangular matrix). Write a program to
rotate the matrix by 90, 180, 270, 360,… degrees. Print the result as a sequence of strings
at the console after receiving the "END" command.

>>>>>INPUT
Rotate(90)
hello
softuni
exam
END
>>>>>OUTPUT
esh
xoe
afl
mtl
 uo
 n
 i

>>>>>INPUT
Rotate(180)
hello
softuni
exam
END
>>>>>OUTPUT
   maxe
inutfos
  olleh

>>>>>INPUT
Rotate(270)
hello
softuni
exam
END
>>>>>OUTPUT
 i
 n
ou
ltm
lfa
eox
hse

>>>>>INPUT
Rotate(720)
js
exam
END
>>>>>OUTPUT
js
exam

>>>>>INPUT
Rotate(810)
js
exam
END
>>>>>OUTPUT
ej
xs
a
m

>>>>>INPUT
Rotate(0)
js
exam
END
>>>>>OUTPUT
js
exam


*/
public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input=input.replace("Rotate(","").replace(")","");
        int rotationTime = Integer.parseInt(input)/90;
        List<String> words = new ArrayList<>();

        String word = scanner.nextLine();
        while(!word.equals("END")){
            words.add(word);
            word = scanner.nextLine();
        }
        int rows = words.size();
        int cols = Collections.max(words, Comparator.comparing(String::length)).length();
        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix,words);

        for (int i = 0; i < rotationTime; i++) {
            matrix = matrixRotate90(matrix);
        }

        printMatrix(matrix);
    }

    private static char[][] matrixRotate90(char[][] oldMatrix) {
        int newRows = oldMatrix[0].length;
        int newCols = oldMatrix.length;
        char[][] newMatrix = new char[newRows][newCols];
        for (int col = 0; col < oldMatrix[0].length; col++) {
            int counter = 0;
            for (int row = oldMatrix.length-1; row >= 0 ; row--) {
                char symbol = oldMatrix[row][col];
                newMatrix[col][counter] = symbol;
                counter++;
            }
        }

        return newMatrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words){
        for (int i = 0; i < matrix.length; i++) {
            String word = words.get(i);
            for (int j = 0; j < matrix[i].length; j++) {
                if (j<word.length()) {
                    matrix[i][j]= word.charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }

            }
        }
    }

    private static void printMatrix(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"");
            }
            System.out.println();
        }
    }
}
