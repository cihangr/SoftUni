import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that reads a sequence of numbers and a special bomb number
with a certain power. Your task is to detonate every occurrence of the special
bomb number and according to its power - his neighbors from left and right.
Detonations are performed from left to right, and all detonated numbers disappear.
Finally, print the sum of the remaining elements in the sequence.
INPUT
1 2 2 4 2 2 2 9
4 2
OUTPUT
12
INPUT
1 4 4 2 8 9 1
9 3
OUTPUT
6
INPUT
1 7 7 1 2 3
7 1
OUTPUT
5
*/
public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bombs = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String data = scanner.nextLine();
        String specialBomb = data.split(" ")[0];
        int power = Integer.parseInt(data.split(" ")[1]);

        while (bombs.contains(specialBomb)){
            int specialIndex = bombs.indexOf(specialBomb);
            int start = specialIndex-power;
            if (start<0){
                start=0;
            }
            int end = specialIndex+power;
            if (end>bombs.size()-1){
                end=bombs.size()-1;
            }
            for (int i = end; i >= start ; i--) {
                bombs.remove(i);
            }
        }
        System.out.println(bombs.stream().mapToInt(Integer::parseInt).sum());
    }
}
