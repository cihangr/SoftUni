package StreamsFilesAndDirectories.ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
@CIHAN GUR

You are given a file named "input.txt". Read and print all of its contents as a sequence
 of bytes (the binary representation of the ASCII code for each character) separated by a single comma.

>>>>>INPUT
On January 1 , 1533 , Michael Angelo,
then fifty-seven years old, writes…
>>>>>OUTPUT
11101111 10111011 10111111 1001111 1101110 100000 1001010 1100001 1101110 1110101…

>>>>>INPUT
Two households, both alike in dignity,
In fair Verona, where we lay our scene…
>>>>>OUTPUT
1010100 1110111 1101111 100000 1101000 1101111 1110101 1110011 1100101 1101000…

*/
public class ReadFile {
    public static void main(String[] args) {

        String path ="/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ReadFile/input.txt";

        try(FileInputStream fileInputStream = new FileInputStream(path);){
            int asciiCode = fileInputStream.read();
            while (asciiCode >= 0) {
                System.out.printf("%s ",Integer.toBinaryString(asciiCode));
                asciiCode = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
