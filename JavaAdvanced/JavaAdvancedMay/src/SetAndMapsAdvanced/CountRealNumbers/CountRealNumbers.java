package SetAndMapsAdvanced.CountRealNumbers;

import java.util.*;

/*
@CIHAN GUR

Write a program that counts the occurrence of real numbers. The input is a single line with real numbers
separated by a space. Print the numbers in the order of appearance. All numbers must be formatted to
one digit after the decimal point.

>>>>>INPUT
-2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3
>>>>>OUTPUT
-2.5 -> 3
4.0 -> 2
3.0 -> 4
-5.5 -> 1

>>>>>INPUT
2.3 4.5 4.5 5.5 5.5 2.3 3.0 3.0 4.5 4.5 3.0 3.0 4.0 3.0 5.5 3.0 2.3 5.5 4.5 3.0
>>>>>OUTPUT
2.3 -> 3
4.5 -> 5
5.5 -> 4
3.0 -> 7
1. -> 1
*/
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> valuesWithOccurences = new LinkedHashMap<>();

        for (double value : values){
            if (!valuesWithOccurences.containsKey(value)){
                valuesWithOccurences.put(value, 1);
            } else {
                valuesWithOccurences.put(value, valuesWithOccurences.get(value) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : valuesWithOccurences.entrySet()){
            System.out.printf("%.1f -> %d", entry.getKey(), entry.getValue());
            System.out.println();
        }

    }
}
