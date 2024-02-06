import java.util.Scanner;

/*
@CIHAN GUR

Write a program that checks if a given password is valid. Password rules are:

· 6 – 10 characters (inclusive);
· Consists only of letters and digits;
· Have at least 2 digits.

If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:

· "Password must be between 6 and 10 characters"
· "Password must consist only of letters and digits"
· "Password must have at least 2 digits"
Inp:

logIn

Output:

Password must be between 6 and 10 characters
Password must have at least 2 digits
 */
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        checkPassword(password);
    }
    public static void checkPassword(String pass){
        boolean valid=true;
        int counter=0;

        for (int i = 0; i < pass.length(); i++) {
            if(Character.isDigit(pass.charAt(i))){
                counter++;
            }
        }
        if (pass.length()<6 || pass.length()>10) {
            System.out.println("Password must be between 6 and 10 characters");
            valid=false;
        }
        if (!pass.matches("[a-zA-Z]{1,}[0-9]{1,}")) {
            System.out.println("Password must consist only of letters and digits");
            valid=false;
        } else if (counter<2) {
            System.out.println("Password must have at least 2 digits");
            valid=false;
        }
        if (valid){
            System.out.println("Password is valid");
        }

    }
}
