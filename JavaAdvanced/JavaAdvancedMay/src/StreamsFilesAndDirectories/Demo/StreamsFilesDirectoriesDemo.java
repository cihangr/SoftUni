package StreamsFilesAndDirectories.Demo;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamsFilesDirectoriesDemo {
    public static void main(String[] args) throws IOException {
        String path = "/Users/cihangur/Desktop/CG/SoftUniLessons/JavaAdvanced/JavaAdvancedMay/src/StreamsFilesAndDirectories/Demo/hello.txt";
        FileInputStream fileStream = new FileInputStream(path);
        int oneByte = fileStream.read();
        while (oneByte >= 0) {
            System.out.println(oneByte);
            oneByte = fileStream.read();
        }
    }
}

