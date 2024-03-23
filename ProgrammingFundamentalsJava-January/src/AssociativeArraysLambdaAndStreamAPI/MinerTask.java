package AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
@CIHAN GUR

Until you receive the "stop" command, you will be given a sequence of strings,
each on a new line. Every odd line on the console represents a resource
(e.g., Gold, Silver, Copper, etc.) and every even - quantity. Your task is to
collect the resources and print them on a new line.
Print the resources and their quantities in the format: "{resource} –> {quantity}".
The quantities inputs will be in the range [1 … 2 000 000 000].

INPUT
Gold
155
Silver
10
Copper
17
stop
OUTPUT
Gold -> 155
Silver -> 10
Copper -> 17

INPUT
gold
155
silver
10
copper
17
gold
15
stop
OUTPUT
gold -> 170
silver -> 10
copper -> 17

*/
public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ore = scanner.nextLine();
        Map<String, Integer> mineMap = new LinkedHashMap<>();
        while(!ore.equals("stop")){
            int value = Integer.parseInt(scanner.nextLine());
            if (!mineMap.containsKey(ore)){
                mineMap.put(ore,value);
            } else {
                int previousValue = mineMap.get(ore);
                mineMap.put(ore,value+previousValue);
            }
            ore = scanner.nextLine();
        }
        for(Map.Entry<String,Integer> mines : mineMap.entrySet()){
            System.out.println(mines.getKey()+" -> "+mines.getValue());
        }
    }
}
