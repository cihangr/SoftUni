package FunctionalProgramming.ListOfPredicates;
/*
@CIHAN GUR

Find all numbers in the range 1..N that is divisible by the numbers of a given sequence. Use predicates.

>>>>>INPUT
10
1 1 1 2
>>>>>OUTPUT
2 4 6 8 10

>>>>>INPUT
100
2 5 10 20
>>>>>OUTPUT
20 40 60 80 100
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();
        List<Predicate<Integer>> predicates = new ArrayList<>();
        for (Integer divisor : divisors){
            Predicate<Integer> predicate = x -> x % divisor == 0;
            predicates.add(predicate);
        }
        for (int number = 1; number <= n; number++) {
            boolean isDivisible = true;
            for (Predicate<Integer> predicate : predicates) {
                if (!predicate.test(number)) {
                    isDivisible = false;
                }
            }
            if (isDivisible) {
                System.out.print(number+" ");
            }
        }


    }
}
