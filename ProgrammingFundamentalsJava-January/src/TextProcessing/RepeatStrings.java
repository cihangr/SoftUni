package TextProcessing;
/*
@CIHAN GUR

Write a Program That Reads an Array of Strings. Each String is Repeated N Times,
Where N is the length of the String. Print the Concatenated String.

INPUT
hi abc add
OUTPUT
hihiabcabcabcaddaddadd

INPUT
work
OUTPUT
workworkworkwork

INPUT
ball
OUTPUT
ballballballball

*/
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] wordArray = words.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : wordArray){
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}
