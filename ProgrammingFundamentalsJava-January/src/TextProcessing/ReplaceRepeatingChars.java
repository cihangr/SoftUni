package TextProcessing;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a string from the console and replaces any sequence of
the same letters with a single corresponding letter.

INPUT
aaaaabbbbbcdddeeeedssaa
OUTPUT
abcdedsa

INPUT
qqqwerqwecccwd
OUTPUT
qwerqwecwd

*/
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder(input);
        for (int i = 0; i < output.length()-1; i++) {
            if (output.charAt(i) == output.charAt(i+1)){
                output.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(output);
    }
}
