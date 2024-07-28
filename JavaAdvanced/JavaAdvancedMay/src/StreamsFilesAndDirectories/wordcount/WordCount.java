package StreamsFilesAndDirectories.wordcount;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
@CIHAN GUR

Write a program that reads a list of words from the file "words.txt" (from the Resources - Exercises)
 and finds how many times each of the words is contained in another file "text.txt"
 (from the Resources - Exercises). Matching should be case-insensitive.

Write the results in the file "results.txt". Sort the words by frequency
in descending order.

>>>>>INPUT
of which The
>>>>>OUTPUT
of - 6
which - 2
The - 1

*/
public class WordCount {
    public static void main(String[] args) throws IOException {
        //we take which words will be count
        String[] words = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/words.txt")).split("\\s+");
        //we take which text weill search
        String text = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/text.txt"));

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words){
            wordCount.put(word, 0);
        }

        for (String word : text.split("\\s+")){
            if (wordCount.containsKey(word)){
                int count = wordCount.get(word)+1;
                wordCount.put(word, count);
            }
        }

        PrintWriter printWriter = new PrintWriter("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/outputOfWordCount.txt");
        wordCount.entrySet().forEach(entry -> printWriter.println(entry.getKey() + " - " + entry.getValue()));
        printWriter.close();
    }
}
