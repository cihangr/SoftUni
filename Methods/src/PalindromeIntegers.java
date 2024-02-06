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
        String number = scanner.nextLine();
        while (!number.equals("END")){
            System.out.println(isPalindrome(number));
            number=scanner.nextLine();
        }
    }
    public static boolean isPalindrome(String n){
        StringBuilder palindrome= new StringBuilder();
        for (int j = n.length()-1; j >= 0 ; j--) {
            palindrome.append(n.charAt(j));
        }
        return palindrome.toString().equals(n);
    }
}
