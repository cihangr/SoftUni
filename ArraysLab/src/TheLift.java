import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that finds a place for the tourist on a lift.
Every wagon should have a maximum of 4 people on it. If a wagon is full, you should direct the people to
the next one with space available.

Input
· On the first line, you will receive how many people are waiting to get on the lift.
· On the second line, you will receive the current state of the lift separated by a single space: " ".

Output
When there is no more available space left on the lift, or there are no more people in the queue, you should
print on the console the final state of the lift's wagons separated by a single space " " and one of the
following messages:
· If there are no more people and the lift has empty spots, you should print:

"The lift has empty spots!
{wagons separated by ' '}"
· If there are still people in the queue and no more available space, you should print:
"There isn't enough space! {people} people in a queue!
{wagons separated by ' '}"
· If the lift is full and there are no more people in the queue, you should print only the wagons separated by a single space " "

 */
public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int peopleOnTheLift = 0;
        int peopleOnCurrentWagon = 0;
        boolean noMorePeople = false;
        int capacity = wagons.length * 4;

        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] < 4) {
                wagons[i]++;
                peopleOnCurrentWagon++;

                if (peopleOnTheLift + peopleOnCurrentWagon == people) {
                    noMorePeople = true;
                    break;
                }
            }
            peopleOnTheLift += peopleOnCurrentWagon;

            if (noMorePeople) {
                break;
            }
            peopleOnCurrentWagon = 0;
        }
        int sumPeopleOnTheLift = Arrays.stream(wagons).sum();
        if (people > peopleOnTheLift) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people - peopleOnTheLift);
            for (int element : wagons) {
                System.out.print(element + " ");
            }

        } else if (sumPeopleOnTheLift == capacity && noMorePeople) {
            for (int element : wagons) {
                System.out.print(element + " ");
            }

        } else if (people < capacity) {
            System.out.println("The lift has empty spots!");
            for (int element : wagons) {
                System.out.print(element + " ");
            }
        }
    }
}