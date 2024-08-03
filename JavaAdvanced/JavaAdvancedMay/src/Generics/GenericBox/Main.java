package Generics.GenericBox;

import java.util.Scanner;

/*
@CIHAN GUR

Create a generic class Box that can store any type. Override the toString() method to print the type and the
value of the stored data in the format "{class full name}: {value}".
Use the class that you've created and test it with the class java.lang.String. On the first line, you will get
n - the number of strings to read from the console. On the next n lines, you will get the actual strings.
For each of them, create a box and call its toString() method to print its data on the console.


>>>>>INPUT
2
life in a box
box in a life
>>>>>OUTPUT
java.lang.String: life in a box
java.lang.String: box in a life

>>>>>INPUT
1
I am a programmer
>>>>>OUTPUT
java.lang.String: I am a programmer
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<String> boxe = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            boxe.add(line);
        }
        System.out.println(boxe);
    }
}
