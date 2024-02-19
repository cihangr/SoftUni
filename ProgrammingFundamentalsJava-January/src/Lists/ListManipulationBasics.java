import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
@CIHAN GUR

Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:

· Add {number} – add a number to the end of the list
· Remove {number} – remove a number from the list
· RemoveAt {index} – remove a number at a given index
· Insert {number} {index} – insert a number at a given index
Note: All the indices will be valid!

When you receive the "end" command, print the final state of the list (separated by spaces)


*/
public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt)
                                     .collect(Collectors.toList());
        String commandline = scanner.nextLine();
        while (!commandline.equals("end")){
            String[] str = commandline.split(" ");
            String command = str[0];
            switch (command){
                case "Add" :
                    numbers.add(Integer.valueOf(str[1]));
                    break;
                case "Remove" :
                    numbers.remove(Integer.valueOf(str[1]));
                    break;
                case "RemoveAt" :
                    int indexToRemove = Integer.parseInt(str[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert" :
                    int numberToInsert = Integer.parseInt(str[1]);
                    int indexToInsert = Integer.parseInt(str[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }

            commandline=scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number+" ");
        }
    }
}
