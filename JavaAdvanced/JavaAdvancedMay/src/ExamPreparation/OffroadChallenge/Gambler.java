package ExamPreparation.OffroadChallenge;
/*
@CIHAN GUR

You will be given an integer n for the size of the game board (square shape). On the next n lines,
 you will receive the rows of the board. The gambler will start at a random position, marked with
 the letter 'G' and have an initial 'entering the game' amount of 100$.
On each turn, until command 'end' is received, you will receive commands for the direction, in which
 the gambler should move. The commands will be "up", "down", "left" and "right".
If a position with '-' (dash) is reached, it means that the field is empty and the gambler awaits
 its next direction.
If the position marked with the letter 'W' is reached the gambler takes it and adds 100$ to his amount
If the position marked with the letter 'P' (penalty) is reached decrease the gambler's total amount
 by 200$
If the position marked with the letter 'J' is reached the gambler wins the jackpot and adds 100000$
to his amount and the game ends.
If the gambler leaves the boundaries of the board or his total amount becomes equal to or drops below
0 (zero), he loses everything and you should stop the program.
The current gambler position should be marked with 'G'
When the gambler leaves a position marked with a letter it should be replaced by '-' (dash)
The program ends when one of these four events occurs:
the gambler leaves the board boundaries
command 'end' is received
the gambler's total winning amount is equal to or drops below 0(zero)
the position marked with 'J' is reached
Input
On the first line, you are given the integer n – the size of the matrix (board).
The next n lines hold the values for every row.
On each of the next lines, you will get a direction command.
Output
If you win the jackpot on the first and second lines print:
"You win the Jackpot!
End of the game. Total amount: {amount}$"
If you do not win the jackpot print:
"End of the game. Total amount: {amount}$"
If you leave the boundaries of the matrix or the gambler's amount becomes 0(zero) or below print:
"Game over! You lost everything!"
Constraints
The square matrix (board) size will be between [4…10].
Gambler's starting position will always be marked with 'G'.
There will always be a field marked with 'W' and it may appear more than once.
There will be always one field marked with 'J'.
There will always be one or two fields marked with 'P'.
You will always receive enough commands to end the game.
Finally if you have any amount print the matrix.

>>>>>INPUT
4
W-GW
W--W
--P-
----
down
down
end
>>>>>OUTPUT
Game over! You lost everything!
>>>>>Explanation
The movement starts from position [0,2] after receiving the command "down" the gambler moves to position
[1,2] where there is a '-' (dash) field - nothing is happening. The next command is "down" again, the
gambler lands on a 'P' (penalty) field and since he has to pay 200$ his sum becomes negative
(100 – 200 = -100) and therefore loses it. The game ends.

>>>>>INPUT
4
G---
WWWW
P---
PJ--
right
right
right
down
left
left
end
>>>>>OUTPUT
End of the game. Total amount: 400$
----
WG--
P---
PJ--

>>>>>INPUT
4
---G
W-W-
---P
--JW
left
down
down
down
right
end
>>>>>OUTPUT
You win the Jackpot!
End of the game. Total amount: 100200$
----
W---
---P
--GW
*/
import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] board = new char[size][size];

        int row=0, col = 0;
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            board[i] = line.toCharArray();
            if(line.contains("G")){
                row = i;
                col=line.indexOf("G");
            }
        }

        String direction = scanner.nextLine();
        int money = 100;
        while (!direction.equals("end")){

            if (direction.equals("up")){
                movePlayerUp(row,col,board, money);
            }

            direction = scanner.nextLine();
        }


    }

    private static void movePlayerUp(int row, int col, char[][] board, int money) {
        int nextRow = row-1;
        if (!isInBounds(nextRow,col,board)){
            System.out.println("Game over! You lost everything!");
        }
        char nextPosSymbol = board[nextRow][col];
        amountToAdd(nextPosSymbol);

    }
    private static int amountToAdd (char symbol){
        if (symbol == 'W'){
            return 100;
        } else if (symbol == 'P'){
            return 200;
        } else if (symbol == 'J'){
            return 100000;
        } else {
            return 0;
        }
    }

    public static boolean isInBounds (int r, int c, char[][] board){
        return r>=0 && r<board.length && c>=0 && c<board[r].length;
    }
}
