package Generics.GenericBoxInteger;
/*
@CIHAN GUR
Previous Question:

Create a generic class Box that can store any type. Override the toString() method to print the type and the
value of the stored data in the format "{class full name}: {value}".
Use the class that you've created and test it with the class java.lang.String. On the first line, you will get
n - the number of strings to read from the console. On the next n lines, you will get the actual strings.
For each of them, create a box and call its toString() method to print its data on the console.

Use the description of the previous problem but now, test your generic box with Integers.

>>>>>INPUT
3
7
123
42
>>>>>OUTPUT
java.lang.Integer: 7
java.lang.Integer: 123
java.lang.Integer: 42

>>>>>INPUT
5
12
13
14
15
16
>>>>>OUTPUT
java.lang.Integer: 12
java.lang.Integer: 13
java.lang.Integer: 14
java.lang.Integer: 15
java.lang.Integer: 16
*/
import Generics.GenericBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Integer> boxI = new Box<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            boxI.add(numbers);
        }
        System.out.println(boxI);
    }
}
