import java.util.Scanner;
/*
@CIHAN GUR

A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
Write a program that reads a positive integer number until you receive "END". For each
numbered print, whether the number is palindrome or not.

 */
public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command="";
        while (!command.equals("END")){
            int i = Integer.parseInt(scanner.nextLine(command));
            System.out.println(isPalindrome(i));
            command=scanner.nextLine();
        }
    }
    
}
