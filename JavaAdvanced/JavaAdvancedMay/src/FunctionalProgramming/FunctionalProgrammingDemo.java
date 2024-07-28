package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class FunctionalProgrammingDemo {
    public static void main(String[] args) {

        //Imperative/Structured Way of Programming
        List<String> names = Arrays.asList("Ivan", "Gosho", "Tosho", "Ivana", "Yagiz", "Mariya", "Cihan", "Dany", "Mark");
        for (String name : names){
            if (name.startsWith("I")){
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println();

        //Functional way of programming
        names.stream()
                .filter(name -> name.startsWith("I")) // Predicate
                .map(name -> name.toUpperCase()) //Function
                .forEach(System.out::println); //Consume

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        //Supplier will supply something
        Supplier<Integer> random = () -> new Random().nextInt();
        System.out.println(random.get());

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        BiFunction<String, String, String> concatenateBiFunction = (a, b) -> a +" "+ b;
        System.out.println(concatenateBiFunction.apply("A", "B"));

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int[] numbers1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();




    }
}
