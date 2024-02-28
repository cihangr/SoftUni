package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that recreates the Memory game.
On the first line, you will receive a sequence of elements. Each element in the sequence will
have a twin. Until the player receives "end" from the console, you will receive strings with
two integers separated by a space, representing the indexes of elements in the sequence.
If the player tries to cheat and enters two equal indexes or indexes which are out of bounds
of the sequence, you should add two matching elements at the middle of the sequence in the
following format:
"-{number of moves until now}a"
Then print this message on the console:
"Invalid input! Adding additional elements to the board"
Input
· On the first line, you will receive a sequence of elements.
· On the following lines, you will receive integers until the command "end".
Output
· Every time the player hit two matching elements, you should remove them from the sequence
and print on the console the following message:
"Congrats! You have found matching elements - ${element}!"
· If the player hit two different elements, you should print on the console the following message:
"Try again!"
· If the player hit all matching elements before he receives "end" from the console,
you should print on the console the following message:
"You have won in {number of moves until now} turns!"
· If the player receives "end" before he hits all matching elements, you should print
on the console the following message:
"Sorry you lose :(
{the current sequence's state}"
Constraints
· All elements in the sequence will always have a matching element.
INPUT
1 1 2 2 3 3 4 4 5 5
1 0
-1 0
1 0
1 0
1 0
end
OUTPUT
Congrats! You have found matching elements - 1!
Invalid input! Adding additional elements to the board Congrats!
You have found matching elements - 2!
Congrats! You have found matching elements - 3!
Congrats! You have found matching elements - -2a!
Sorry you lose :(
4 4 5 5
INPUT
a 2 4 a 2 4
0 3
0 2
0 1
0 1
end
OUTPUT
Congrats! You have found matching elements - a!
Congrats! You have found matching elements - 2!
Congrats! You have found matching elements - 4!
You have won in 3 turns!
INPUT
a 2 4 a 2 4
4 0
0 2
0 1
0 1
end
OUTPUT
Try again!
Try again!
Try again!
Try again!
Sorry you lose :(
a 2 4 a 2 4
*/
public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int moves = 0;
        String input = scanner.nextLine();
        while(!input.equals("end")){
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            moves++;

            boolean isValid = isValid(firstIndex, secondIndex, elements.size()-1);
            if (!isValid){
                String newElement = String.format("-%da",moves);
                elements.add(elements.size()/2,newElement);
                elements.add(elements.size()/2,newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String  elementOfFirst = elements.get(firstIndex);
                String  elementOfSecond = elements.get(secondIndex);
                if (elementOfSecond.equals(elementOfFirst)){
                    elements.remove(elementOfFirst);
                    elements.remove(elementOfSecond);
                    System.out.printf("Congrats! You have found matching elements - %s!\n",elementOfFirst);
                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()){
                System.out.printf("You have won in %d turns!",moves);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ",elements));


    }

    private static boolean isValid(int firstIndex, int secondIndex, int size) {
        boolean notSame = firstIndex != secondIndex;
        boolean firstIndexBound = firstIndex>=0 && firstIndex<=size;
        boolean secondIndexBound = secondIndex>=0 && secondIndex<=size;
        return notSame && firstIndexBound && secondIndexBound;
    }
}
