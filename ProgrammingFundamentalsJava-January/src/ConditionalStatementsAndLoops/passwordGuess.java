import java.util.Scanner;

public class passwordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String passCode = "s3cr3t!P@ssw0rd";
        String pass = scan.nextLine();
        if (pass.equals(passCode)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
