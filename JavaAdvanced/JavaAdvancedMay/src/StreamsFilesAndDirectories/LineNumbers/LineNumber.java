package StreamsFilesAndDirectories.LineNumbers;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a text file ("inputLineNumbers.txt" from the Resources - Exercises) and inserts
line numbers in front of each of its lines. The result should be written to another text file – "output.txt".

>>>>>INPUT
Two households, both alike in dignity,
In fair Verona, where we lay our scene,
From ancient grudge break to new,
Where civil blood makes civil hands.
From forth the fatal loins of these two
A pair of star-cross'd lovers take their
life;
Whose misadventured piteous overthrows
Do with their death bury their parents'
strife.
>>>>>OUTPUT
1. Two households, both alike in dignity,
2. In fair Verona, where we lay our scene,
3. From ancient grudge break to new,
4. Where civil blood makes civil hands.
5. From forth the fatal loins of these two
6. A pair of star-cross'd lovers take their life;
7. Whose misadventured piteous overthrows
8. Do with their death bury their parents' strife.

*/
public class LineNumber {
    public static void main(String[] args) throws IOException {
        String path = "/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/inputLineNumbers.txt";
        List<String> lines = Files.readAllLines(Path.of(path));

        PrintWriter printWriter = new PrintWriter("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/OutputInputLineNumbers.txt");
        int counter = 1;
        for (String line : lines) {
            String outputLine = String.format("%d. %s", counter, line);
            counter++;
            printWriter.println(outputLine);
        }
        printWriter.close();
    }
}
