package TextProcessing;
/*
@CIHAN GUR

Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
A valid username is:
Has a length of between 3 and 16 characters.
It contains only letters, numbers, hyphens, and underscores.

INPUT
sh, too_long_username, !lleg@l ch@rs, jeffbutt
OUTPUT
jeffbutt

INPUT
Jeff, john45, ab, cd, peter-ivanov, @smith
OUTPUT
"Jeff
John45
peter-ivanov"

*/
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwords = scanner.nextLine();
        String[] passwordsArray = passwords.split(", ");
        for (String password : passwordsArray){
            if (isPasswordValid(password)){
                System.out.println(password);
            }
        }
    }

    private static boolean isPasswordValid(String password) {
        if (password.length()<3 || password.length()>16) return false;
        for (char symbols : password.toCharArray()){
            if (!Character.isLetterOrDigit(symbols) && symbols!='-' && symbols!='_') return false;
        }
        return true;
    }
}
