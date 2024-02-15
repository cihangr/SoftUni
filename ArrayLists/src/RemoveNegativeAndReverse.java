import java.util.*;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Read a list of integers, remove all negative numbers from it and print the remaining
elements in reversed order. In case of no elements left in the list, print "empty".
INPUT
10 -5 7 9 -33 50
OUTPUT
50 9 7 10
*/
public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> transformed = new ArrayList<>();
        for (int number : numbers){
            if (number>0){
                transformed.add(number);
            }
        }
        //Collections.sort(transformed); // no need to sort
        Collections.reverse(transformed);
        if (transformed.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(transformed.toString()
                    .replace("[","")
                    .replace("]","")
                    .replace(",","")
            );
        }
    }
}
