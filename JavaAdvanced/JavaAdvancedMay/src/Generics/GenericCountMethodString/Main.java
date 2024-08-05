package Generics.GenericCountMethodString;
/*
@CIHAN GUR

Create a method that receives as an argument a list of any type that can be compared and an element of the given type.
The method should return the count of elements that are greater than the value of the given element. Modify your Box
class to support comparing by the value of the data stored.
On the first line, you will receive n - the number of elements to add to the list. On the next n lines, you will
receive the actual elements. On the last line, you will get the value of the element to which you need to compare
every element in the list.

FOR STRINGS
>>>>>INPUT
3
aa
aaa
bb
aa
>>>>>OUTPUT
2

>>>>>INPUT
6
a
b
c
d
e
f
g
>>>>>OUTPUT
0

FOR DOUBLES
>>>>>INPUT
3
7.13
123.22
42.78
7.55
>>>>>OUTPUT
2

>>>>>INPUT
1
1231542.123
1
>>>>>OUTPUT
1
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        /*Counter<String> count = new Counter<>();
        for (int i = 0; i < n; i++) {
           String input = scanner.nextLine();
           count.add(input);
        }
        String valueToCompare = scanner.nextLine();
        System.out.println(count.countGreaterValues(valueToCompare));*/

        Counter<Double> countDouble = new Counter<>();
        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            countDouble.add(input);
        }
        double doubleValueForCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(countDouble.countGreaterValues(doubleValueForCompare));

    }
}
