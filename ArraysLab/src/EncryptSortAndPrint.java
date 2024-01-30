import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a sequence of strings from the console. Encrypt every string by summing:

· The code of each vowel multiplied by the string length.
· The code of each consonant is divided by the string length.

Sort the number sequence in ascending order and print it on the console.
On the first line, you will always receive the number of strings you must read.

 */
public class EncryptSortAndPrint {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        int[] codes = new int[n];
        for (int i = 0; i < n; i++) {
            String name = inp.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'y', 'z', 'q', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'Y', 'Z', 'Q'};
        int code = 0;
        //Loop for each letter of the String
        for (int position = 0; position < name.length(); position++) {
            for (char vowel : vowels) {
                if (name.charAt(position) == vowel) {
                    code += vowel * name.length();
                }
            }
            for (char consonant : consonants) {
                if (name.charAt(position) == consonant) {
                    code += consonant / name.length();
                }
            }
        }
        codes[i]=code;
    }
        Arrays.sort(codes);
        for (int code : codes) {
            System.out.print(code + "\n");
        }
    }
}