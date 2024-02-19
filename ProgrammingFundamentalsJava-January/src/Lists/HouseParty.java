import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that keeps track of guests going to a house party.

On the first input line, you are going to receive how many commands you are going to have.
On the next lines you are going to receive some of the following inputs:
· "{name} is going!"
· "{name} is not going!"
If you receive the first type of input, you have to add the person if he/she is not on the list.
If he/she is in the list, print on the console: "{name} is already in the list!".
If you receive the second type of input, you must remove the person if he/she is on the list.
If not, print: "{name} is not in the list!". In the end, print all guests.

Examples
Input
4
Allie is going!
George is going!
John is not going!
George is not going!
Output
John is not in the list!
Allie
5
Tom is going!
Annie is going!
Tom is going!
Garry is going!
Jerry is going!
Output
Tom is already in the list!
Tom
Annie
Garry
Jerry
*/
public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guestsList = new ArrayList<>();
        int command = Integer.parseInt(scanner.nextLine());
        while (command>0){
            String text = scanner.nextLine();
            String guest = text.split(" ")[0];
            String status = text.split(" ")[2];
            if (status.equals("going!")){
                if (!guestsList.contains(guest)){
                    guestsList.add(guest);
                } else {
                    System.out.println(guest+" is already in the list!");
                }
            } else if (status.equals("not")){
                if (guestsList.contains(guest)){
                    guestsList.remove(guest);
                } else {
                    System.out.println(guest+" is not in the list!");
                }
            }

            command--;
        }
        for (String G : guestsList){
            System.out.println(G);
        }

    }
}
