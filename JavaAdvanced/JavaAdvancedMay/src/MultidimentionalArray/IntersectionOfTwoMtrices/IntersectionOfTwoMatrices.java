package MultidimentionalArray.IntersectionOfTwoMtrices;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads two char matrices (A[][] and B[][]) of the same order M * N
and prints the third matrix C[][], which is filled with the intersecting elements of A and B,
otherwise set the element to '*'. On the first two lines, you receive M and N,
then on 2 * M lines N characters – the matrices elements.
The matrix elements may be any ASCII char except '*'.

INPUT
3
4
a b c d
a b c d
a b c d
k b c k
a b g d
a k c d
OUTPUT
* b c *
a b * d
a * c d

INPUT
5
2
1 2
3 4
5 6
7 8
9 1
0 2
3 1
1 6
7 4
1 1
OUTPUT
* 2
3 *
* 6
7 *
* 1
*/
public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        int col = Integer.parseInt(sc.nextLine());
        String[][] matrix1 = new String[row][col];
        String[][] matrix2 = new String[row][col];
        for (int i = 0; i < row; i++) {
            String[] line = sc.nextLine().split(" ");
            matrix1[i] = line;
        }
        for (int i = 0; i < row; i++) {
            String[] line = sc.nextLine().split(" ");
            matrix2[i] = line;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix1[i][j].equals(matrix2[i][j])) {
                    System.out.print(matrix1[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
