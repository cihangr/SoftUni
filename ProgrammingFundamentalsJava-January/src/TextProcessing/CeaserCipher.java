package TextProcessing;

import java.util.Scanner;

/*
@CIHAN GUR
Write a program that returns an encrypted version of the same text.
Encrypt the text by shifting each character with three positions forward.
For example, A would be replaced by D, B would become E, and so on. Print the encrypted text.

INPUT
Programming is cool!
OUTPUT
Surjudpplqj#lv#frro$

INPUT
One year has 365 days.
OUTPUT
Rqh#|hdu#kdv#698#gd|v1

*/
public class CeaserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i);
            char forAppend = (char) (number+3);
            output.append(forAppend);
        }
        System.out.println(output);

        /*
        Alternative Solution
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            // 'A' -> 'D'
            char encryptedSymbol = (char) (symbol + 3);
            encryptedText.append(encryptedSymbol);
        }
         */
    }
}
