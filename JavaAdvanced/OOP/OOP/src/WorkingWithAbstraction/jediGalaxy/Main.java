package WorkingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];
        creatingMatrix(row, col, matrix);

        String command = scanner.nextLine();
        long totalStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediLocation = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilLocation = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            int rowEvil = evilLocation[0];
            int colEvil = evilLocation[1];
            evilMovement(rowEvil, colEvil, matrix);

            int rowJedi = jediLocation[0];
            int colJedi = jediLocation[1];
            totalStars = jediMovement(rowJedi, colJedi, matrix, totalStars);

            command = scanner.nextLine();
        }
        System.out.println(totalStars);

    }

    private static long jediMovement(int rowJedi, int colJedi, int[][] matrix, long sum) {
        while (rowJedi >= 0 && colJedi < matrix[1].length) {
            if (rowJedi >= 0 && rowJedi < matrix.length && colJedi >= 0 && colJedi < matrix[0].length) {
                sum += matrix[rowJedi][colJedi];
            }
            colJedi++;
            rowJedi--;
        }
        return sum;
    }

    private static void evilMovement(int rowEvil, int colEvil, int[][] matrix) {
        while (rowEvil >= 0 && colEvil >= 0) {
            if (rowEvil >= 0 && rowEvil < matrix.length && colEvil >= 0 && colEvil < matrix[0].length) {
                matrix[rowEvil] [colEvil] = 0;
            }
            rowEvil--;
            colEvil--;
        }
    }

    private static void creatingMatrix(int row, int col, int[][] matrix) {
        int value = 0;
        for (int rowNumber = 0; rowNumber < row; rowNumber++) {
            for (int colNumber = 0; colNumber < col; colNumber++) {
                matrix[rowNumber][colNumber] = value++;
            }
        }
    }
}
