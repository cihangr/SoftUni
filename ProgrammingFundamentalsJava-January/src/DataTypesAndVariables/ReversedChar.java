package DataTypesAndVariables;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that takes 3 lines of characters and prints
 them in reversed order with a space between them.
 */
public class ReversedChar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        String s2 = inp.nextLine();
        String s3 = inp.nextLine();
        System.out.printf("%s %s %s", s3,s2,s1);

    }
}
