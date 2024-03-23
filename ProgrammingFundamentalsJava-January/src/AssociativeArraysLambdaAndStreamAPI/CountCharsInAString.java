package AssociativeArraysLambdaAndStreamAPI;
/*
@CIHAN GUR

Write a program that counts all characters in a string except space (' ').

Print all occurrences in the following format:

"{char} -> {occurrences}"

INPUT
text
OUTPUT
t -> 2
e -> 1
x -> 1

INPUT
text text text
OUTPUT
t -> 6
e -> 3
x -> 3

*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        for (char symbol : input.toCharArray()){
            if (symbol==' '){
                continue;
            }
            if (!characterCount.containsKey(symbol)){
                characterCount.put(symbol,1);
            } else {
                int counter = characterCount.get(symbol);
                characterCount.put(symbol,counter+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : characterCount.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
