package TextProcessing;
/*
@CIHAN GUR

You will be given a series of strings until you receive an "end" command.
Write a program that reverses strings and prints each pair on a separate
line in the format "{word} = {reversed word}".

INPUT
helLo
Softuni
bottle
end
OUTPUT
helLo = oLleh
Softuni = inutfoS
bottle = elttob

INPUT
Dog
caT
chAir
end
OUTPUT
Dog = goD
caT = Tac
chAir = riAhc

*/
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("end")){
            String reversedInput = "";
            for (int i = input.length()-1 ; i >= 0; i--) {
                char symbol = input.charAt(i);
                reversedInput += symbol;
            }

            System.out.println(input+" = "+reversedInput);
            input = scanner.nextLine();
        }
    }
}
