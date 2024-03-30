package TextProcessing;

import java.util.Scanner;

/*
@CIHAN GUR

Create a method that takes two strings as arguments and returns the sum of their character
codes multiplied (multiply str1[0] with str2[0] and add to the total sum). Then continue
with the next two characters. If one of the strings is longer than the other, add the remaining
character codes to the total sum without multiplication.

INPUT
George Peter
OUTPUT
52114

INPUT
123 522
OUTPUT
7647

INPUT
love SoftUni
OUTPUT
45337

*/
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String firstInput = input.split(" ")[0];
        String secondInput = input.split(" ")[1];

        System.out.println(Multiplier(firstInput,secondInput));

    }

    private static int Multiplier(String firstInput, String secondInput) {
        int minSize = Math.min(firstInput.length(), secondInput.length());
        int sum=0;
        if (minSize==firstInput.length()){
            for (int i = 0; i < firstInput.length(); i++) {
                sum +=(firstInput.charAt(i)*secondInput.charAt(i));
            }
            for (int i = firstInput.length(); i < secondInput.length() ; i++) {
                sum += secondInput.charAt(i);
            }
        } else {
            for (int i = 0; i < secondInput.length(); i++) {
                sum +=(firstInput.charAt(i)*secondInput.charAt(i));
            }
            for (int i = secondInput.length(); i < firstInput.length() ; i++) {
                sum += firstInput.charAt(i);
            }
        }
        return sum;
    }
}
