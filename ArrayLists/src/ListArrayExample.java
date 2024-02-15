import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Making the First Array List
 */
public class ListArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        //get length/size of the listArray
        System.out.println(numbers.size());

        //adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //changing
        numbers.set(1, 12);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //removing from value
        numbers.remove(Integer.valueOf(30));
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        //removing from index
        numbers.remove(1);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //converting to string. Adding [ ] brackets and comma.
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.toString());  // [10,20,30,...]
        System.out.println(numbers.isEmpty());  // true false
        System.out.println(numbers.indexOf(50));  // -1 if there is no such an element

    }
}