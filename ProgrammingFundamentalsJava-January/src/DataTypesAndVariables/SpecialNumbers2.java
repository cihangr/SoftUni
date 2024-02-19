import java.util.Scanner;

/*
@CIHAN GUR

You are given a working code that is a solution to Problem 9. Special Numbers. However,
the variables are improperly named, declared before they are needed, and some of them
are used for multiple things. Without using your previous solution, modify the code
so that it is easy to read and understand.

 */
public class SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kolkko = Integer.parseInt(scanner.nextLine());
        int obshto = 0;
        int takova = 0;
        String toe = "False";
        for (int ch = 1; ch <= kolkko; ch++) {
            takova = ch;
            while (ch > 0) {
                obshto += ch % 10;
                ch = ch / 10;
            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11) ? "True": "False";
            System.out.printf("%d -> %s%n", takova, toe);
            obshto = 0;
            ch = takova;
        }
    }
}
