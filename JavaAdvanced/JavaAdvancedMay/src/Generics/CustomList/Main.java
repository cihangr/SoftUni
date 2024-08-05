package Generics.CustomList;

import java.util.Scanner;

/*
@CIHAN GUR

Create a generic data structure that can store any type that can be compared. Implement functions:
void add(T element)
T remove(int index)
boolean contains(T element)
void swap(int index, int index)
int countGreaterThan(T element)
T getMax()
T getMin()
Create a command interpreter that reads commands and modifies the custom list that you have created. Implement the commands:
Add {element} - Adds the given element to the end of the list.
Remove {index} - Removes the element at the given index.
Contains {element} - Prints if the list contains the given element (true or false).
Swap {index1} {index2} - Swaps the elements at the given indexes.
Greater {element} - Counts the elements that are greater than the given element and prints their count
Max - Prints the maximum element in the list.
Min - Prints the minimum element in the list.
Print - Prints all elements in the list, each on a separate line.
END - stops the reading of commands.
Note: For the Judge tests, use String as T.

>>>>>INPUT
Add aa
Add bb
Add cc
Max
Min
Greater aa
Swap 0 2
Contains aa
Print
END
>>>>>OUTPUT
cc
aa
2
true
cc
bb
aa

>>>>>INPUT
Add Peter
Add George
Swap 0 0
Swap 1 1
Swap 0 1
Swap 1 0
Swap 0 1
Print
END
>>>>>OUTPUT
George
Peter
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();
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
            }
            input = scanner.nextLine();
        }

    }
}
