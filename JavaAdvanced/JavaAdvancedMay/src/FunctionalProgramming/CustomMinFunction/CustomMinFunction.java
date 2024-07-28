package FunctionalProgramming.CustomMinFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/*
@CIHAN GUR

Write a simple program that reads a set of numbers from the console and finds the
smallest of the numbers using a simple Function<Integer[], Integer>.


>>>>>INPUT
1 4 3 2 1 7 13
>>>>>OUTPUT
1

>>>>>INPUT
4 5 -2 3 -5 8
>>>>>OUTPUT
-5
*/
public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        //Function
        Function<List<Integer>, Integer> minFunction = listOfNumbers -> Collections.min(listOfNumbers);

        Integer min = minFunction.apply(numbers);
        System.out.println(min);
    }
}
