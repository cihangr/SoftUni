package StreamsFilesAndDirectories.SumLines;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads a text file ("input.txt" from the Resources - Exercises) and prints on the
console the sum of the ASCII symbols of each of its lines. Use BufferedReader in combination with FileReader.
Examples
INPUT
On January 1 , 1533 ,
Michael Angelo,
then fifty-seven years old,
writes
from Florence to
Tommaso de' Cavalieri,
a youth of noble Roman family,
OUTPUT
1452
1397
2606
670
1573
2028
2762
*/
public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/input.txt";
        List<String> lines = Files.readAllLines(Path.of(path));

        for (String line : lines){
            int sum = 0;
            for (char symbol : line.toCharArray()){
                sum+=symbol;
            }
            System.out.println(sum);
        }
        System.out.println("===========");
        //Alternative
        try ( BufferedReader br = Files.newBufferedReader(Path.of(path))){
            String line = br.readLine();
            while (line != null){
                long sum = 0;
                for (char symbol : line.toCharArray()){
                    sum+=symbol;
                }
                System.out.println(sum);
                line = br.readLine();
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }

    }
}
