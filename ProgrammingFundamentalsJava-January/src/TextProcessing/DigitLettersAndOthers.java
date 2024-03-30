package TextProcessing;
/*
@CIHAN GUR

Write a program that receives a single string and on the first line prints all the digits,
on the second – all the letters, and on the third – all the other characters. There will
always be at least one digit, one letter, and another character.

INPUT
Agd#53Dfg^&4F53
OUTPUT
53453
AgdDfgF
#^&

INPUT
a1!
OUTPUT
1
a
!

*/

import java.util.Scanner;

public class DigitLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)){
                numbers.append(current);
            } else if (Character.isLetter(current)) {
                letters.append(current);
            } else {
                symbols.append(current);
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);


    }
}
