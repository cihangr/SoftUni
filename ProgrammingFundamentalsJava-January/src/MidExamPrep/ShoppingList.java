package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

It’s the end of the week, and it is time for you to go shopping,
so you need to create a shopping list first.
Input
>> You will receive an initial list with groceries separated by "!".
>> After that you will be receiving 4 types of commands, until you receive "Go Shopping!"

>> Urgent {item} - add the item at the start of the list. If the item already exists, skip this command.
>> Unnecessary {item} - remove the item with the given name, only if it exists in the list.
Otherwise, skip this command.
>> Correct {oldItem} {newItem} – if the item with the given old name exists, change
its name with the new one. If it doesn't exist, skip this command.
>> Rearrange {item} - if the grocery exists in the list, remove it from its current
position and add it at the end of the list.

>> There won`t be any duplicate items in the initial list
>>Print the list with all the groceries, joined by ", ".
>> "{firstGrocery}, {secondGrocery}, …{nthGrocery}"
INPUT
Tomatoes!Potatoes!Bread
Unnecessary Milk
Urgent Tomatoes
Go Shopping!
OUTPUT
Tomatoes, Potatoes, Bread
INPUT
Milk!Pepper!Salt!Water!Banana
Urgent Salt
Unnecessary Grapes
Correct Pepper Onion
Rearrange Grapes
Correct Tomatoes Potatoes
Go Shopping!
OUTPUT
Milk, Onion, Salt, Water, Banana
*/
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("Go Shopping!")){
            String operator = command.split(" ")[0];
            String item = command.split(" ")[1];
            switch(operator){
                case "Urgent" :
                    if (shoppingList.contains(item)){
                        break;
                    } else {
                        shoppingList.add(0,item);
                    }
                break;
                case "Unnecessary" :
                    shoppingList.remove(item);
                break;
                case "Correct" :
                    String CorrectItem = command.split(" ")[2];
                    if (shoppingList.contains(item)) {
                        int index = shoppingList.indexOf(item);
                        shoppingList.remove(item);
                        shoppingList.add(index, CorrectItem);
                    }
                break;
                case "Rearrange" :
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                break;
                default:
                break;
            }
            command = scanner.nextLine();
        }
        System.out.println(shoppingList.toString()
                .replace("[","")
                .replace("]",""));
    }
}
