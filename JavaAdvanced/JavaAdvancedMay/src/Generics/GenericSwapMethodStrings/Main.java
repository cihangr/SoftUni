package Generics.GenericSwapMethodStrings;

import java.util.Scanner;

/*
@CIHAN GUR

Create a generic method that receives a list containing any type of data and swaps the elements at
two given indexes.
As in the previous problems, read n number of boxes of type String and add them to the list. On the
next line, however, you will receive a swap command consisting of two indexes. Use the method you've
 created to swap the elements corresponding to the given indexes and print each element in the list.


>>>>>INPUT
3
Peter
George
Swap me with Peter
0 2
>>>>>OUTPUT
java.lang.String: Swap me with Peter
java.lang.String: George
java.lang.String: Peter

>>>>>INPUT
2
Uni
Soft
0 1
>>>>>OUTPUT
java.lang.String: Soft
java.lang.String: Uni
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Swap<String> changes = new Swap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            changes.add(input);
        }
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        changes.swap(index1, index2);
        System.out.println(changes);
    }
}
