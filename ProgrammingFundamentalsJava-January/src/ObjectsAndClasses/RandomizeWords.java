package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

/*
@CIHAN GUR

You are given a list of words in one line. Randomize their order and print each word on a separate line.
INPUT
Welcome to SoftUni and have fun learning programming
OUTPUT
learning
Welcome
SoftUni
and
fun
programming
have
to

INPUT
Java is the best programming language
OUTPUT
the
programming
best
language
is
Java

*/
public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Split the string into words
        String[] wordsArray = inputString.split(" ");

        //FIRST METHOD//
        /*
        // Convert the string array to an ArrayList
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, wordsArray);

        // Randomize the order of the words
        Collections.shuffle(words);

        // Print each word on a separate line
        for (String word : words) {
            System.out.println(word);
        }
        */
        Random rdn = new Random();
        for (int i = 0; i < wordsArray.length-1; i++) {
            int rdn1 = rdn.nextInt(wordsArray.length);
            int rdn2 = rdn.nextInt(wordsArray.length);
            String oldWord = wordsArray[rdn1];
            wordsArray[rdn1] = wordsArray[rdn2];
            wordsArray[rdn2] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArray));
        }
    }

