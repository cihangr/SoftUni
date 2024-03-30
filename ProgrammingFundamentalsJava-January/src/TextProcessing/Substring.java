package TextProcessing;

import java.util.Scanner;

/*
@CIHAN GUR

On the first line, you will receive a string. On the second line, you will receive a second string.
Write a program that removes all of the occurrences of the first String in the second until there
is no match. At the end, print the remaining String.

INPUT
ice
kicegiciceeb
OUTPUT
kgb

INPUT
e
fixture
OUTPUT
fixtur

*/
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyWord = scanner.nextLine();
        String givenWord = scanner.nextLine();

        int index = givenWord.indexOf(keyWord);
        while (index != -1){
            givenWord = givenWord.replace(keyWord,"");
            index = givenWord.indexOf(keyWord);
        }
        System.out.println(givenWord);
    }
}
