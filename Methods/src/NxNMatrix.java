import java.util.Scanner;

/*
@CIHAN GUR

Write a method that receives a single integer n and prints an nxn matrix with that number.
 */
public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        nxnMatrix(N);
    }

    public static void nxnMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
