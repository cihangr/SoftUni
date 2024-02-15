import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
INPUT
1 2 3 4 5
OUTPUT
6 6 3

INPUT
1 2 3 4
OUTPUT
5 5
*/
public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        //numbers:{1 2 3 4 5}
        List<Integer> gauss = new ArrayList<>();
        int counter=0;
        while (counter<=(numbers.size()/2-1)){
            gauss.add(numbers.get(numbers.size()-1-counter)+numbers.get(counter));
            counter++;
        }
        if (numbers.size()%2==0) {
            for (int gaus : gauss) {
                System.out.print(gaus + " ");
            }
        } else {
            gauss.add(numbers.get(((numbers.size()-1)/2)));
            for (int gaus : gauss) {
                System.out.print(gaus + " ");
            }
        }

    }
}
