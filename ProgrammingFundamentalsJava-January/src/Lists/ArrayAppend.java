package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program to append several arrays of numbers.

>> Arrays are separated by "|".
>> Values are separated by spaces (" ", one or several).
>> Order the arrays from the last to the first and their values from left to right.
INPUT
1 2 3 |4 5 6 | 7 8
OUTPUT
7 8 4 5 6 1 2 3
INPUT
7 | 4 5|1 0| 2 5 |3
OUTPUT
3 2 5 1 0 4 5 7

*/
public class ArrayAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arraysInList = Arrays.stream(scanner.nextLine().split("\\|")) .collect(Collectors.toList());
        Collections.reverse(arraysInList);
        String output = arraysInList.toString()
                .replace("]","")
                .replace("[","")
                .replace(",","")
                .replaceAll("\\s+"," ")
                .trim();
        System.out.println(output);
    }
}
