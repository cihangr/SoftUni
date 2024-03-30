package TextProcessing;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reads the path to a file and subtracts the file name and its extension.

INPUT
C:\Internal\training-internal\Template.pptx
OUTPUT
File name: Template
File extension: pptx

INPUT
C:\Projects\Data-Structures\LinkedList.cs
OUTPUT
File name: LinkedList
File extension: cs

*/
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String[] pathFiles = path.split("\\\\");
        String fileName = pathFiles[pathFiles.length-1].split("\\.")[0];
        String extension = pathFiles[pathFiles.length-1].split("\\.")[1];

        System.out.println("File name: "+fileName);
        System.out.println("File extension: "+extension);
    }
}
