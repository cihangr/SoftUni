import java.util.Scanner;
/*
@CIHAN GUR

Write a program that reads 3 lines of input. On each line, you get a single character.
Combine all the characters into one string and print it on the console.
 */
public class CharToString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        String s2 = inp.nextLine();
        String s3 = inp.nextLine();
        String s4 = s1+s2+s3;
        System.out.println(s4);
    }
}
