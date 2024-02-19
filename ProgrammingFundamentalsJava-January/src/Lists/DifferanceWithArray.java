package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Single Line ArrayList Reading
 */
public class DifferanceWithArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Describing array and arraylist
        int[] arr = new int[10];  // array
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50)); // array list

        System.out.println("sizes");//taking sizes
        System.out.println(arr.length);
        System.out.println(list.size());
        System.out.println();

        System.out.println("calling elements");
        System.out.println(arr[0]);
        System.out.println(list.get(0));
        System.out.println();

        System.out.println("adding elements");
        arr[1] = 5;
        list.add(60); // adding to the end
        list.add(2,15); // adding to the given index
        System.out.println(arr[1]);
        System.out.println(list.get(6));
        System.out.println(list.get(2));
        System.out.println();

        System.out.println("showing elements");//showing elements
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("showing elements with for loops");//showing the elements with for
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
