package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You will be given two hands of cards, which will be integer numbers.
Assume that you have two players. You must find the winning deck and, respectively, the winner.

You start from the beginning of both hands. Compare the cards from the
first deck to those from the second. The player, who has a bigger card,
takes both cards and puts them on the back of his hand - the second
player's card is last, and the first person's card (the winning one)
is before it (second to last), and the player with the smaller card must
remove the card from his deck.
If both players' cards have the same values
- no one wins, and the two cards must be removed from the decks. The game
is over when one of the decks is left without any cards. You have to print
the winner on the console and the sum of the left cards: "{First/Second}
player wins! Sum: {sum}".
INPUT
20 30 40 50
10 20 30 40
OUTPUT
First player wins! Sum: 240
INPUT
10 20 30 40 50
50 40 30 30 10
OUTPUT
Second player wins! Sum: 50
*/
public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstHand.isEmpty() && !secondHand.isEmpty()){
            int firstHandCard = firstHand.get(0);
            int secondHandCard = secondHand.get(0);

            firstHand.remove(0);
            secondHand.remove(0);

            if (firstHandCard>secondHandCard){
                firstHand.add(firstHandCard);
                firstHand.add(secondHandCard);
            } else if (secondHandCard>firstHandCard){
                secondHand.add(secondHandCard);
                secondHand.add(firstHandCard);
            }
        }
        if (!firstHand.isEmpty()){
            int sum = firstHand.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("First player wins! Sum: %d",sum);
        } else {
            int sum = secondHand.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Second player wins! Sum: %d",sum);
        }

    }
}
