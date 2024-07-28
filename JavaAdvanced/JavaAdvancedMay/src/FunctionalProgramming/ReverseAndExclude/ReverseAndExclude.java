package FunctionalProgramming.ReverseAndExclude;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that reverses a collection and removes elements that are divisible by a given integer n.


>>>>>INPUT
1 2 3 4 5 6
2
>>>>>OUTPUT
5 3 1

>>>>>INPUT
20 10 40 30 60 50
3
>>>>>OUTPUT
50 40 10 20
*/
public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        //For condition we need PREDICATE function.
        Predicate<Integer> predicate = number -> number % n == 0;

        numbers.removeIf(predicate);
        numbers.forEach(num -> System.out.print(num + " "));



    }
}
