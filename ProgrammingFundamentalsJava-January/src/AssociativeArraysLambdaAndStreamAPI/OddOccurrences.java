package AssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that extracts from a given sequence of words all elements that
are present in it an odd number of times (case-insensitive).

· Words are given in a single line, space-separated.
· Print the result elements in lowercase in their order of appearance.

INPUT
Java C# PHP PHP JAVA C java
OUTPUT
java, c#, c

INPUT
3 5 5 hi pi HO Hi 5 ho 3 hi pi
OUTPUT
5, hi


INPUT
a a A SQL xx a xx a A a XX c
OUTPUT
a, sql, xx, c

*/
public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] wordsArray = words.split(" ");

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : wordsArray){
            String lowerCaseWord = word.toLowerCase();
            if (!wordsMap.containsKey(lowerCaseWord)){
                wordsMap.put(lowerCaseWord,1);
            } else {
                int counter = wordsMap.get(lowerCaseWord);
                wordsMap.put(lowerCaseWord,counter+1);
            }
        }

        List<String> odd = new ArrayList<>();

        for(Map.Entry<String,Integer> word : wordsMap.entrySet()){
            if (word.getValue()%2==1){
                odd.add(word.getKey());
            }
        }
        String output = odd.toString();
        System.out.println(output.replace("[","").replace("]",""));

    }
}
