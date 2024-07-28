package FunctionalProgramming.PredicateForNames;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a predicate. Its goal is to check a name for its length and to return true if the length of the name
is less or equal to the passed integer. You will be given an integer that represents the length you have
to use. On the second line, you will be given a string array with some names. Print the names,
passing the condition in the predicate.


>>>>>INPUT
4
Sara Sam George Mark John
>>>>>OUTPUT
Sara
Sam
Mark
John

>>>>>INPUT
4
George Peter Zara Sara
>>>>>OUTPUT
Zara
Sara
*/
public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> namesLength = name -> name.length() <= n;
        names.stream()
                .filter(namesLength)
                .forEach(name -> System.out.println(name));

        System.out.println("\n=========================\n");
        //Alternative Solution
        for (String name : names){
            if(namesLength.test(name)){
                System.out.println(name);
            }
        }
    }
}
