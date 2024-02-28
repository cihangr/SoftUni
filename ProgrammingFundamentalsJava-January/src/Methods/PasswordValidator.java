package Methods;

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
        if (!isLengthOk(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isLengthOk(password) && isConsistLettersAndDigits(password) && isTwoDigits(password)){
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthOk(String s) {
        return s.length() > 6 && s.length() < 10;
    }

    public static boolean isConsistLettersAndDigits(String s) {
        for (char symbol : s.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwoDigits(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                counter++;
            }
        }
        return counter >= 2;
    }
}