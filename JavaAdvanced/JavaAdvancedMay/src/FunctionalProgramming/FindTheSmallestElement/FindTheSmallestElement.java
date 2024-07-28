package FunctionalProgramming.FindTheSmallestElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/*
@CIHAN GUR

Write a program that is using a custom function (written by you) to find the smallest integer in a sequence of integers.
The input could have more than one space. Your task is to collect the integers from the console, find the smallest
one and print its index (if more than one such elements exist, print the index of the rightmost one).
Hints
Use a Function<List<Integer>, Integer> or something similar.

>>>>>INPUT
1 2 3 0 4 5 6
>>>>>OUTPUT
3

>>>>>INPUT
123 10 11 3
>>>>>OUTPUT
3
*/
public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();
        Function<List<Integer>,Integer> findSmallestElement = x -> Collections.min(numbers);
        int smallestElement = findSmallestElement.apply(numbers);
        System.out.println(numbers.indexOf(smallestElement));
    }
}
//Score 75/100?