package Generics.GenericSwapMethodIntegers;
import java.util.Scanner;

/*
@CIHAN GUR

Use the description of the previous problem but now, test your list of generic boxes with Integers.

>>>>>INPUT
3
7
123
42
0 2
>>>>>OUTPUT
java.lang.Integer: 42
java.lang.Integer: 123
java.lang.Integer: 7

>>>>>INPUT
5
12
13
14
15
16
3 4
>>>>>OUTPUT
java.lang.Integer: 12
java.lang.Integer: 13
java.lang.Integer: 14
java.lang.Integer: 16
java.lang.Integer: 15
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Swap2<Integer> changes = new Swap2<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            changes.add(input);
        }
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        changes.swp(index1, index2);
        System.out.println(changes);

        Swap2<?> anyType = new Swap2<>();
        System.out.println(anyType);

    }

}
