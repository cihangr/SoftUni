package Generics.CustomListSorter;
import Generics.CustomList.CustomList;

import java.util.Scanner;

/*
@CIHAN GUR

Extend the previous problem by creating an additional Sorter class. It should have a single static method
sort() which can sort objects of type CustomList containing any type that can be compared. Extend the
command list to support one additional command Sort:
Sort - Sort the elements in the list in ascending order.

>>>>>INPUT
Add cc
Add bb
Add aa
Sort
Print
END
>>>>>OUTPUT
aa
bb
cc

>>>>>INPUT
Add Peter
Add George
Max
Sort
Print
END
>>>>>OUTPUT
Peter
George
Peter
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scan.nextLine();
        while(!input.equals("END")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch(command){
                case "Add" :
                    String name = tokens[1];
                    customList.add(name);
                    break;
                case "Remove" :
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains" :
                    String value = tokens[1];
                    System.out.println(customList.contains(value));
                    break;
                case "Swap" :
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater" :
                    String element = tokens[1];
                    System.out.println(customList.countGreaterThan(element));;
                    break;
                case "Max" :
                    System.out.println(customList.getMax());
                    break;
                case "Min" :
                    System.out.println(customList.getMin());
                    break;
                case "Print" :
                    System.out.println(customList);
                    break;
                case "Sort" :
                    customList.sort();
                    break;
            }
            input = scan.nextLine();
        }
    }
}
