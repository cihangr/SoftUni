package Methods;

import java.util.Scanner;
/*
@CIHAN GUR

Create a method for printing triangles as shown below:
Input 3
Output
1
1 2
1 2 3
1 2
1
 */

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            printTriangle(1,i);
        }
        for (int i = n-1; i > 0 ; i--) {
            printTriangle(1,i);
        }
    }
    public static void printTriangle(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
