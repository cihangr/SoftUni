package TextProcessing;
/*
@CIHAN GUR

Write a program that takes a text and a string of banned words.
All words included in the ban list should be replaced with asterisks "*", equal
to the word's length. The entries in the ban list will be separated by a comma and space ", ".

The ban list should be entered on the first input line and the text on the second input line.

INPUT
Linux, Windows
It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client
OUTPUT
It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client

INPUT
computer, programming, set
In computer programming, an application programming interface (API) is a set of subroutine definitions, communication protocols, and tools for building software.
OUTPUT
In ******** ***********, an application *********** interface (API) is a *** of subroutine definitions, communication protocols, and tools for building software.

*/
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyWords = scanner.nextLine();
        String[] keyWordArray = keyWords.split(", ");
        String text = scanner.nextLine();

        for (String keyWord : keyWordArray){
            String replacement = "*".repeat(keyWord.length());
            text=text.replace(keyWord,replacement);
        }
        System.out.println(text);
    }
}
