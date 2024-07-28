package FunctionalProgramming.ConsumerPrint;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/*
@CIHAN GUR

Write a program that reads a collection of strings, separated by one or more whitespaces, from the
 console and then prints them onto the console. Each string should be printed on a new line. Use a Consumer<T>.


>>>>>INPUT
Peter George Alex
>>>>>OUTPUT
Peter
George
Alex

>>>>>INPUT
John Sam Sara
>>>>>OUTPUT
John
Sam
Sara
*/
public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Consumer<String> consumer = (name) -> System.out.println(name);
        for (String name : names) {
            consumer.accept(name);
        }

        System.out.println();
        //Second method
        names.forEach(consumer);

    }
}
