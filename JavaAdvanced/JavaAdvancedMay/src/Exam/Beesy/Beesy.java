package Exam.Beesy;
/*
@CIHAN GUR

Bees are indispensable for maintaining the health of ecosystems, promoting biodiversity, supporting agriculture, and ensuring food availability for human populations worldwide. Protecting bee populations and their habitats is crucial for the well-being of both ecosystems and humanity.
You will be given an integer n for the size of the field with a square shape. On the next n lines, you will receive the rows of the field. 
Your bee will be placed in a random position, marked with the letter 'B'. 
There will be flowers with nectar which need to be pollinated on random positions, marked with a single digit. 
There will be a hive, marked with the letter 'H'. 
All of the empty positions will be marked with '-'. 
The bee will have 15 units of energy initially.
A command is received each turn until the bee runs out of energy or reaches the hive. 
the bee must collect and take at least 30 units of nectar to the hive. This would be the required quantity to make honey successfully.
Keep in mind that even if the needed amount of nectar is collected, but the hive is not reached the bee continues to move according to the commands.
You will be given commands for the bee's movement. The commands will be: "up", "down", "left", and "right". The bee moves towards the given direction. With each move, the bee's energy decreases by 1 unit.
If the bee leaves the field (goes out of the boundaries of the matrix) depending on the move command,  it will be moved to the opposite side of the field.  Example: In a 3x3 matrix the bee is at position [1,2] and receives the command "right" it will be moved to position [1,0].
If the bee moves to a flower (a position marked with a digit), it collects the nectar (the value of the digit is added to the total amount of collected nectar) the flower disappears and should be replaced by '-'.
If the bee runs out of energy, and the total amount of collected nectar is less than 30 units, the program ends. The correct output should be printed on the Console.
If the bee runs out of energy and the total amount of collected nectar is at least 30 units, the energy will be restored with the amount of the difference between the nectar collected up to this turn and the minimum required amount for making honey (30). The value of the collected nectar is dropped to 30 units. The energy can be restored only once.
Example: Collected nectar is equal to 40 units. 40 – 30 = 10. The bee's energy is increased by 10, the nectar is decreased to 30 units.
Hint: Check for zero energy after restoration.
The next time the bee runs out of energy, the movement discontinues. The program ends.  The correct output should be printed on the Console.
If the bee reaches a position, marked with  'H', the hive is reached and the program ends. 
Hint: If reaching the hive with zero energy, the success will depend on the amount of the collected nectar. The correct output should be printed on the Console.
Input
On the first line, you are given the integer n – the size of the square matrix.
The next n lines hold the values for every matrix row.
After that, you will get a move command on each of the next lines.
Output
On the first line:
If the bee reaches the hive with at least 30 units of nectar collected, print this message and stop the program: 
"Great job, Beesy! The hive is full. Energy left: {energy}"
If the bee reaches the hive but has not succeeded in collecting at least 30 units of nectar: 
"Beesy did not manage to collect enough nectar."
If the bee runs out of energy, before returning to the hive: 
"This is the end! Beesy ran out of energy."
On the next lines.
Print the final state of the matrix, with the last known position of the bee, marked with 'B'.
Constraints
The size of the square matrix (field) will be between [2…10].
Only the letters 'B' and 'H' will be present in the matrix.
The flowers with nectar are represented by single positive digits between [0…9].
There will always be enough commands to finish the program.


>>>>>INPUT
5
--B--
H-987
-4812
5----
2----
down
right
right
down
left
left
left
down
left
up
up
up
>>>>>OUTPUT
Great job, Beesy! The hive is full. Energy left: 4
-----
B----
-----
-----
2----

>>>>>>>>>>>>>EXPLANATION<<<<<<<<<<
The bee starts from the position [0,2]. The first command is "down". The bee moves to position [1,2] and gets 9 units of nectar. The initial energy drops to 14 units. The next command is "right" -> position [1,3] gets 8 units of nectar, and the energy drops to 13 units. Then the command "right" again, position -> [1,4] and nectar -> 17 + 7, energy -> 12. The next commands are "down", "left","left", and "left" -> and the bee collects accordingly 2,1,8 and 4 units of nectar. Position -> [2,1], Nectar -> 24 + 2 + 1 + 8 + 4 = 39, Energy -> 8.
 Then "down" and "left" commands follow and your bee adds another 5 units of nectar to the previous amount. Finally, we get a command "up" three times, but the bee steps on the letter 'H' and that means it has reached the hive successfully collecting 44 units of nectar.
Position -> [1,0], Nectar -> 39 + 5 = 44, Energy -> 4.


>>>>>INPUT
4
B999
--5-
---H
----
right
right
right
down
left
left
left
left
down
>>>>>OUTPUT
Great job, Beesy! The hive is full. Energy left: 6
----
----
---B
----

>>>>>>>>>>>>>EXPLANATION<<<<<<<<<<
The bee starts its movement following the given commands – three times "right" and collects the digits (amounts of nectar) -> 9+9+9 =27. Next is a "down" command followed by four "left" commands (collects another 5 units of nectar on the second "left" command) on the fourth left command the bee leaves the field boundaries and then appears on the opposite side of the field [1,3]. Finally, the bee gets the "down" command to reach the hive and the program ends with 32 units of nectar collected.

>>>>>>INPUT
4
B---
1991
----
---H
down
right
right
right
down
down
left
>>>>>>OUTPUT
Beesy did not manage to collect enough nectar.
----
----
----
---B

>>>>>>>>>>INPUT
6
B-----
111111
------
111111
------
H-----
down
right
right
right
right
right
down
left
left
left
left
left
down
right
right
right
right
right

>>>>>>>>>OUTPUT
This is the end! Beesy ran out of energy.
------
------
------
--B111
------
H-----


*/
public class Beesy {
}
