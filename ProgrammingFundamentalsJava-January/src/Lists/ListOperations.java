package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You will be given numbers (a list of integers) on the first input line.
Until you receive "End" you will be given operations you must apply on the list. The possible commands are:

· Add {number} - add number at the end
· Insert {number} {index} - insert number at given index
· Remove {index} - remove that index
· Shift left {count} - first number becomes last 'count' times
· Shift right {count} - last number becomes first 'count' times

Note: The index given may be outside the array's bounds. In that case, print "Invalid index".
INPUT
1 23 29 18 43 21 20
Add 5
Remove 5
Shift left 3
Shift left 1
End
OUTPUT
43 20 5 1 23 29 18

INPUT
5 12 42 95 32 1
Insert 3 0
Remove 10
Insert 8 6
Shift right 1
Shift left 2
End
OUTPUT
Invalid index
5 12 42 95 32 8 1 3
*/
public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        String opearation = scanner.nextLine();
        while(!opearation.equals("End")){
            String command = opearation.split(" ")[0];
            switch(command){
                case "Add" :
                    int commandNumber = Integer.parseInt(opearation.split(" ")[1]);
                    numbers.add(commandNumber);
                break;
                case "Insert" :
                    int commandInsert = Integer.parseInt(opearation.split(" ")[1]);
                    int commandIndex = Integer.parseInt(opearation.split(" ")[2]);
                    if (commandIndex>numbers.size() || commandIndex<0){
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(commandIndex,commandInsert);
                    }
                break;
                case "Remove" :
                    int commandRemove = Integer.parseInt(opearation.split(" ")[1]);
                    if (commandRemove>numbers.size() || commandRemove<0){
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(commandRemove);
                    }
                break;
                case "Shift" :
                    String leftOrRight = opearation.split(" ")[1];
                    int digit = Integer.parseInt(opearation.split(" ")[2]);
                    if (leftOrRight.equals("left") && digit>=0){
                        while (digit>0){
                            int move = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(move);
                            digit--;
                        }
                    } else if (leftOrRight.equals("right") && digit>=0) {
                        while (digit>0){
                            int move = numbers.get(numbers.size()-1);
                            numbers.remove(numbers.size()-1);
                            numbers.add(0,move);
                            digit--;
                        }
                    }
                    break;
                default:
                break;
            }


            opearation = scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number+" ");
        }
    }
}
