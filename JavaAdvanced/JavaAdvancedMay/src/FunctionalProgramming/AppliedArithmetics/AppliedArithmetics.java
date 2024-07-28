package FunctionalProgramming.AppliedArithmetics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
@CIHAN GUR

On the first line, you are given a list of numbers. On the next lines you are passed different
commands that you need to apply to all numbers in the
list: "add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" -> prints all
numbers on a new line. The input will end with an "end" command, after which the result must be printed.

>>>>>INPUT
1 2 3 4 5
add
add
print
end
>>>>>OUTPUT
3 4 5 6 7

>>>>>INPUT
5 10
multiply
subtract
print
end
>>>>>OUTPUT
9 19
*/
public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();

        //function which will work on commands
        Function<List<Integer>,List<Integer>> addFunction = listOfNumber -> listOfNumber.stream().map(number -> number+1).toList();
        //Alternative
        //UnaryOperator<Integer> incrementByOne = x -> x+1;
        //if the function one type, it can be useful.
        Function<List<Integer>,List<Integer>> multiplyFunction = listOfNumber -> listOfNumber.stream().map(number -> number*2).toList();
        Function<List<Integer>,List<Integer>> subtractFunction = listOfNumber -> listOfNumber.stream().map(number -> number-1).toList();


        //while loop with commands
        String command = scanner.nextLine();
        while(!command.equals("end")){
            switch(command){
                case "add" :
                    numbers = addFunction.apply(numbers);
                break;
                case "multiply" :
                    numbers = multiplyFunction.apply(numbers);
                break;
                case "subtract" :
                    numbers = subtractFunction.apply(numbers);
                break;
                case "print" :
                    numbers.forEach(number -> System.out.print(number + " "));
                    System.out.println();
                break;
            }
            command = scanner.nextLine();
        }



        
    }
}
