package AssociativeArraysLambdaAndStreamAPI;
/*
@CIHAN GUR

Read a list of real numbers and print them in ascending order along with their number of occurrences.
INPUT
8 2 2 8 2
OUTPUT
2 -> 3
8 -> 2

INPUT
1 5 1 3
OUTPUT
1 -> 2
3 -> 1
5 -> 1

INPUT
-2 0 0 2
OUTPUT
-2 -> 1
0 -> 2
2 -> 1

*/
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbersMap = new TreeMap<>();

        for (double number : numbers){
            if (!numbersMap.containsKey(number)){
                numbersMap.put(number,1);
            } else {
                int counter = numbersMap.get(number);
                numbersMap.put(number,counter+1);
            }
        }
        for(Map.Entry<Double,Integer> pair : numbersMap.entrySet()){
            System.out.printf("%.0f -> %d%n",pair.getKey(),pair.getValue());
        }
    }
}
