package StreamsFilesAndDirectories.SumBytes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
@CIHAN GUR

Write a program that reads a text file ("input.txt" from the Resources - Exercises) and prints on
the console the sum of the ASCII symbols of all characters inside the file. Use BufferedReader
in combination with FileReader.

>>>>>INPUT
On January 1 , 1533 ,
Michael Angelo,
then fifty-seven years old,
writes
from Florence to
Tommaso de' Cavalieri,
a youth of noble Roman family,
>>>>>OUTPUT
12488

*/
public class SumBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/input.txt"));
        int sum = 0;
        String line = br.readLine();
            while (line != null) {
                for (char symbol : line.toCharArray()) {
                    sum += symbol;
                }
                line = br.readLine();
            }

            System.out.println(sum);

        
    }
}
