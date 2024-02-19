import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int B = inp.nextInt();
        if (A>B){
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
