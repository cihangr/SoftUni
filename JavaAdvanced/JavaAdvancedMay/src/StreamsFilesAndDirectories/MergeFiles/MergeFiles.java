package StreamsFilesAndDirectories.MergeFiles;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

/*
@CIHAN GUR

Write a program that reads the contents of two text files ("inputOne.txt", "inputTwo.txt"
from Resources - Exercises) and merges them into a third one.

>>>>>INPUT
File One
1
2
3
File two
4
5
6
>>>>>OUTPUT
1
2
3
4
5
6

*/
public class MergeFiles {
    public static void main(String[] args) throws IOException {
        String firstFile = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/inputOne.txt"));
        String secondFile = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/inputTwo.txt"));

        PrintWriter writer = new PrintWriter("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/outputMergeFiles.txt");
        writer.println(firstFile);
        writer.println(secondFile);
        writer.close();
    }
}
