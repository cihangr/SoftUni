package SetAndMapsAdvanced.Viona;
/*
@CIHAN GUR

Write a program that:
Reads 20 numbers for both players, separated with " " (single space).
Every player can hold unique numbers.
Each Round, both players get the top number from their deck. The player with
the bigger number gets both numbers and adds them to the bottom of his sequence.
The game ends after 50 rounds or if any player loses all of his numbers.
Input
Numbers – Integer
Output
Output must be "First player win!", "Second player win!" or "Draw!".


>>>>>INPUT
26 58 16 92 44 65 65 77 57 23 71 57 7 52 85 44 32 70 38 23
43 95 33 51 62 93 57 55 0 31 32 95 68 34 30 51 37 32 11 97
>>>>>OUTPUT
Second player win!

>>>>>INPUT
74 78 82 42 19 39 29 69 20 42 31 77 57 36 76 26 4 9 83 42
15 43 80 71 22 88 78 35 28 30 46 41 76 51 76 18 14 52 47 38
>>>>>OUTPUT
First player win!

*/
import java.util.*;
import java.util.stream.Collectors;

public class Viona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = readSet(scanner);
        LinkedHashSet<Integer> secondPlayer = readSet(scanner);

        int round = 50;
        while (round-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int firstNumber = getFirstNumber(firstPlayer);
            firstPlayer.remove(firstNumber);
            int secondNumber = getFirstNumber(secondPlayer);
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }
        }

        if (firstPlayer.size() == secondPlayer.size()) {
            System.out.println("Draw!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }


    }

    private static int getFirstNumber(LinkedHashSet<Integer> playersHand) {
        int firstNumber;
        for (Integer n : playersHand){
            return n;
        }
        return 0;
    }

    private static LinkedHashSet<Integer> readSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
