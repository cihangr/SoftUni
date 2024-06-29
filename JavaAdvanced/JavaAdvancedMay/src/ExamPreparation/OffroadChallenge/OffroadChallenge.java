package ExamPreparation.OffroadChallenge;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
@CIHAN GUR

John is quite an avid off-road fan. He bought a new jeep and made the necessary improvements to it.
John is ready for new off-road adventures and can't wait to get started. In this challenge, he must
save his fuel very carefully…
There will be two sequences of integers. The first sequence will represent the initial fuel and
the second - additional consumption index due to thin air at high altitudes, hence higher fuel
consumption. There will also be a third sequence of integers, representing values equal to the
necessary amount of fuel needed to reach the corresponding altitude in the challenge.

Your task is to take the last fuel quantity from the fuel sequence and the first index from the
additional consumption index sequence. Subtract the values and check the result.
The corresponding altitude is reached if the calculated result is bigger or equal to the first
element from the needed amount of fuel sequence. You need to remove both the fuel and the
consumption index from their sequences as well as the needed amount of fuel index from their sequence.
If the calculated result is smaller or not equal to the first element from the needed amount
of fuel sequence, the corresponding altitude is not reached, movement cannot continue, and the
program should end.

Input
The first line will represent the initial fuel – integers, separated by a single space.
The second line will represent the consumption indexes that decrease initial fuel – integers, separated by a single space.
The third line will represent the quantities needed to reach the corresponding altitude – integers, separated by a single space.

Output
On the first or the next n lines, output the corresponding message on the console from the following options:
If John reaches the altitude, print the message:
"John has reached: Altitude 1"
…
"John has reached: Altitude {n}"
If John fails to reach the altitude, print the message:
"John did not reach: Altitude {n}"
On the next lines, based on whether he reached the top or not, print the following on the console in the specified format:
If John doesn't have enough fuel to reach the top but has reached some altitude, display the following messages:
"John failed to reach the top.
Reached altitudes: Altitude 1, … Altitude {n}"
If John does not have enough fuel to reach the top and has not reached any altitude, print:
"John failed to reach the top.
John didn't reach any altitude."
If John manages to reach all the altitudes, he will reach the top. End the program and print on the console the following message:
"John has reached all the altitudes and managed to reach the top!"

Constraints
All the given numbers will be valid integers in the range [1, 200].
All sequences always consist of four elements.
There will be no negative input.


>>>>>INPUT
200 90 40 100
20 40 30 50
50 60 80 90
>>>>>OUTPUT
John has reached: Altitude 1
John did not reach: Altitude 2
John failed to reach the top.
Reached altitudes: Altitude 1

Explanation
We start by taking the last fuel quantity from the fuel sequence (100) and the first additional
consumption index from the consumption index fuel sequence (20). The result from subtraction is
100 - 20 = 80. After that, we check if the sum equals or exceeds the first amount of needed fuel.
The result (80) is more than the needed fuel (50) for this altitude, so the altitude is reached.
As the altitude is reached, we remove an element from every sequence. We continue with the next
altitude to do the same and as a result, we have 40 – 40 = 0. The needed fuel is 60, we do not
have enough fuel to reach the current altitude, so the challenge for John ends here.


>>>>>INPUT
40 66 123 100
10 30 70 33
40 55 77 100
>>>>>OUTPUT
John has reached: Altitude 1
John has reached: Altitude 2
John did not reach: Altitude 3
John failed to reach the top.
Reached altitudes: Altitude 1, Altitude 2

Explanation
Here we take the last fuel quantity and like in the previous case subtract the consumption
index from the fuel and continue forward until the result is equal to or greater than the required
fuel otherwise the program stops.

>>>>>INPUT
199 190 100 100
20 40 30 50
50 60 70 80
>>>>>OUTPUT
John has reached: Altitude 1
John has reached: Altitude 2
John has reached: Altitude 3
John has reached: Altitude 4
John has reached all the altitudes and managed to reach the top!

Explanation
Here all altitudes are conquered, and John successfully reaches the top.
*/
public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> fuelQuantity = new ArrayDeque<>(); //stack -- push
        fillArrayDeque(scanner, fuelQuantity::push);
        ArrayDeque<Integer> consumptionIndex = new ArrayDeque<>(); //deck -- offer
        fillArrayDeque(scanner, consumptionIndex::offer);
        ArrayDeque<Integer> neededFuel = new ArrayDeque<>(); //deck -- offer
        fillArrayDeque(scanner, neededFuel::offer);

        int counter = 1;

        while(!neededFuel.isEmpty()){
            int fuel = fuelQuantity.pop();
            fuel = fuel - (consumptionIndex.poll()+neededFuel.poll());
            if (fuel >= 0){
                System.out.println("John has reached: Altitude "+ counter++);
            } else {
                System.out.println("John did not reach: Altitude "+ counter);
                break;
            }

        }
        if (!neededFuel.isEmpty()){
            System.out.println("John failed to reach the top.");
            System.out.println("Reached altitudes: ");
            System.out.println(IntStream.range(1,counter).mapToObj(e -> "Altitude "+e).collect(Collectors.joining(", ")));
        } else {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        }


    }

    public static void fillArrayDeque (Scanner scanner, Consumer<Integer> consumptionIndex) {
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(consumptionIndex);
    }

}
