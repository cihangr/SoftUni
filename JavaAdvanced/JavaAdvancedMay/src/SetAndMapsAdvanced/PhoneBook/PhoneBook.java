package SetAndMapsAdvanced.PhoneBook;
/*
@CIHAN GUR

Write a program that receives some info from the console about people and their phone numbers.
You are free to choose how the data is entered. Each entry should have just one name and one number
(both of them strings). If you receive a name that already exists in the phonebook, simply update its number.
After filling this simple phonebook, upon receiving the command "search", your program should be able
to perform a search of contact by name and print her details in the format "{name} -> {number}".
In case the contact isn't found, print "Contact {name} does not exist.".

>>>>>INPUT
John-0888080808
search
Maria
John
stop
>>>>>OUTPUT
Contact Maria does not exist.
John -> 0888080808

>>>>>INPUT
John-00359888001122
Peter-0040333111000
George-0049112233
Samuel-0047123123123
search
Samuel
samuel
PeTeR
Peter
stop
>>>>>OUTPUT
Samuel -> 0047123123123
Contact samuel does not exist.
Contact PeTeR does not exist.
Peter -> 0040333111000
*/
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("search")){
            String name = input.split("-")[0];
            String number = input.split("-")[1];
            phoneBook.put(name, number);
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while(!command.equals("stop")){
            if (phoneBook.containsKey(command)){
                System.out.printf("%s -> %s\n", command, phoneBook.get(command));
            } else {
                System.out.printf("Contact %s does not exist.\n", command);
            }
            command = scanner.nextLine();
        }

    }
}
