package FunctionalProgramming.CustomComparator;

import java.util.*;
import java.util.function.Predicate;

/*
@CIHAN GUR

Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
Pass it to an Arrays.sort() function and print the result.

>>>>>INPUT
1 2 3 4 5 6
>>>>>OUTPUT
2 4 6 1 3 5

>>>>>INPUT
-3 2
>>>>>OUTPUT
2 -3
*/
public class CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        Comparator<Integer> comparator = (first,second) -> {
            if (first%2 != 0 && second%2 == 0) {
                return 1;
            }
            if (first%2 == 0 && second%2 != 0) {
                return -1;
            }
            return first.compareTo(second);
        };

        numbers.stream().sorted(comparator).forEach(number -> System.out.print(number+" "));


    }
}
