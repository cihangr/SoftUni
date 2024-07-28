package StreamsFilesAndDirectories.CountCharacterTypes;
/*
@CIHAN GUR

Write a program that reads a list of words from the file ("input.txt" from the Resources - Exercises)
and finds the count of vowels, other symbols, and punctuation marks. Assume that:
a, e, i, o, u are vowels, only lower case.
All others are other symbols.
Punctuation marks are (!,.?).
Do not count whitespace.
Write the results to another file – "output.txt".

>>>>>INPUT
On January 1 , 1533 , Michael Angelo, then
fifty-seven years old, writes
from Florence to Tommaso de' Cavalieri, a
youth of noble Roman family,
>>>>>OUTPUT
Vowels: 41
Other symbols: 72
Punctuation: 6

*/
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        //reding the content in the file
        String content = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/input.txt"));
        //removing the spaces in the text
        content = content.replaceAll("\\s+", "");
        //starting the counters
        int countVowels = 0;
        int countPunctuations = 0;
        int countOthers = 0;
        //for each symbol, increase the counters
        for (char symbol : content.toCharArray()){
            //check the symbol with methods
            if (isVowel(symbol)){
                countVowels++;
            } else if (isPunctuation(symbol)) {
                countPunctuations++;
            } else {
                countOthers++;
            }
        }

        //print the file and export
        PrintWriter printWriter = new PrintWriter("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/outputCountCharacterTypes.txt");
        printWriter.println("Vowels: " + countVowels);
        printWriter.println("Other symbols: " + countOthers);
        printWriter.println("Punctuation: " + countPunctuations);
        printWriter.close();
    }
    private static boolean isVowel(char symbol) {
        //aeiou
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
    private static boolean isPunctuation(char symbol) {
        //.,!?
        return symbol == '.' || symbol == '!' || symbol == '?' || symbol == ',';
    }
}
