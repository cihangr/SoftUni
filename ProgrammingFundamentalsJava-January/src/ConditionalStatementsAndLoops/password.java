package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username = inp.nextLine();
        String password = inp.nextLine();

        String input = inp.nextLine();

        while (!input.equals(password)){
            input = inp.nextLine();
        }
        System.out.printf("Welcome %s!", username);

    }
}
