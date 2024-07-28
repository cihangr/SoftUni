package FunctionalProgramming.KnightsOfHonor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/*
@CIHAN GUR

Write a program that reads a collection of names as strings from the console and then appends "Sir" in
front of every name and prints it back onto the console. Use a Consumer<T>.

>>>>>INPUT
Peter George Alex Stan
>>>>>OUTPUT
Sir Peter
Sir George
Sir Alex
Sir Stan

>>>>>INPUT

>>>>>OUTPUT

*/
public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Consumer<String> consumer = (name) -> System.out.println("Sir "+name);
        for (String name : names) {
            consumer.accept(name);
        }

        System.out.println();
        //Second method
        names.forEach(consumer);
    }
}
