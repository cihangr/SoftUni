package MidExamPrep;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program that keeps track of every won battle against an enemy.
You will receive initial energy.
Afterward, you will start receiving the distance you need to reach an
enemy until the "End of battle" command is given, or you run out of energy.

The energy you need for reaching an enemy is equal to the distance you receive. Each time
you reach an enemy, you win a battle, and your energy is reduced. Otherwise, if you don't
have enough energy to reach an enemy, end the program and print: "Not enough energy!
Game ends with {count} won battles and {energy} energy".

Every third won battle increases your energy with the value of your current count of won battles.
Upon receiving the "End of battle" command, print the count of won battles in the following format:
"Won battles: {count}. Energy left: {energy}"

Input / Constraints

>> On the first line, you will receive initial energy – an integer [1-10000].
>> On the following lines, you will be receiving the distance of an enemy – an integer [1-10000]

Output

>> The description contains the proper output messages for each case and the format they should be printed.

INPUT
100
10
10
10
1
2
3
73
10
OUTPUT
Not enough energy! Game ends with 7 won battles and 0 energy

INPUT
200
54
14
28
13
End of battle
OUTPUT
Won battles: 4. Energy left: 94
*/
public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullEnergy = Integer.parseInt(scanner.nextLine());
        int wins=0;
        String command = scanner.nextLine();
        while(!command.equals("End of battle")){
            int distance = Integer.parseInt(command);
            if (distance>fullEnergy){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wins, fullEnergy);
                return;
            } else {
                fullEnergy-=distance;
                wins++;
                if (wins%3==0){
                    fullEnergy+=wins;
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wins,fullEnergy);
    }
}