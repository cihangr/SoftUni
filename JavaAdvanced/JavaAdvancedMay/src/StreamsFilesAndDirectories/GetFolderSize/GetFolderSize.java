package StreamsFilesAndDirectories.GetFolderSize;

import java.io.File;

/*
@CIHAN GUR

Write a program that traverses a folder and calculates its size in bytes. Use Folder Exercises Resources in Resources.

>>>>>INPUT
Exercises Resources
>>>>>OUTPUT
Folder size: 2878

*/
public class GetFolderSize {
    public static void main(String[] args) {
        String folderPath = "/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/ExercisesResources2/Exercises Resources";

        int size = 0;
        File folder = new File(folderPath);
        for (File file : folder.listFiles()) {
            size += file.length();
        }

        System.out.println("Folder size: " + size);



    }
}
