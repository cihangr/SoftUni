package StreamsFilesAndDirectories.WriteToAFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
@CIHAN GUR

Read the file named "input.txt" that is provided for this exercise and write all its content to a
file while skipping any punctuation. Skip the following symbols: ",", ".", "!", "?".


>>>>>INPUT
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes
>>>>>OUTPUT
On January 1  1533  Michael Angelo then fifty-seven years old writes

>>>>>INPUT
Two households, both alike in dignity.
In fair Verona, where we lay our scene.
>>>>>OUTPUT


Create a FileInputStream to read the file.
Create a FileOutputStream to write to a file.
Create a list, containing all characters that you need to skip and check if the current char is contained in it.


*/
public class Main {
    public static void main(String[] args) {
        String inputPath ="/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/WriteToAFile/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";
        String outputPath ="/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/WriteToAFile/04. Java-Advanced-Files-and-Streams-Lab-Resources/02.WriteToFileOutput.txt";

        try(FileInputStream fileInputStream = new FileInputStream(inputPath)
        ; FileOutputStream fileOutputStream = new FileOutputStream(outputPath)){
            int asciiCode = 0;
            while ((asciiCode = fileInputStream.read()) >= 0) {
                //, . ! ?
                if (asciiCode==46 || asciiCode==44 || asciiCode==63 || asciiCode==33 ){
                    continue;
                }
                asciiCode = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
