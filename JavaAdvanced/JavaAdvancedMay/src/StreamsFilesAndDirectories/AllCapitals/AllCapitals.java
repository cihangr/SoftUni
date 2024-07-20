package StreamsFilesAndDirectories.AllCapitals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
@CIHAN GUR

Write a program that reads a text file ("input.txt" from the Resources - Exercises) and changes the casing
of all letters to the upper. Write the output to another file ("output.txt").

>>>>>INPUT
On January 1 , 1533 ,
Michael Angelo,
then fifty-seven years old,
writes
from Florence to
Tommaso de' Cavalieri,
a youth of noble Roman family,
>>>>>OUTPUT
ON JANUARY 1 , 1533 ,
MICHAEL ANGELO,
THEN FIFTY-SEVEN YEARS OLD,
WRITES
FROM FLORENCE TO
TOMMASO DE' CAVALIERI,
A YOUTH OF NOBLE ROMAN FAMILY,
*/
public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String content = null;
        try {
            content = Files.readString(Path.of("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/input.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        content = content.toUpperCase();
        System.out.println(content);

        System.out.println("================================");
        //create a file and write the output here.
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/outputAllCapitals.txt"));
        writer.write(content);
        writer.close();

    }

}
