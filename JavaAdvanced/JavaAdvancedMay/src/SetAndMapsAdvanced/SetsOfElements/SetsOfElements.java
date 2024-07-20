package SetAndMapsAdvanced.SetsOfElements;
/*
@CIHAN GUR

On the first line, you are given the length of two sets, N and M. On the next N + M lines,
there are N numbers that are in the first set and M numbers that are in the second one.
Find all non-repeating element that appears in both of them, and print them in the same order at the console:
Set with length N = 4: {1, 3, 5, 7}
Set with length M = 3: {3, 4, 5}
Set that contains all repeating elements -> {3, 5}

>>>>>INPUT
4 3
1
3
5
7
3
4
5
>>>>>OUTPUT
3 5

>>>>>INPUT
2 2
1
3
1
5
>>>>>OUTPUT
1
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int firstSize = Integer.parseInt(input.split(" ")[0]);
        int secondSize = Integer.parseInt(input.split(" ")[1]);

        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        while(firstSize-- >0) {
            set1.add(scanner.nextInt());
        }
        while(secondSize-- >0) {
            set2.add(scanner.nextInt());
        }

        for (Integer numbers : set1){
            if (set2.contains(numbers)){
                System.out.print(numbers+" ");
            }
        }
    }
}
