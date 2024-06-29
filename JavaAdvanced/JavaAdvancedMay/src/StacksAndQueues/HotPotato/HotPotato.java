package StacksAndQueues.HotPotato;
/*
@CIHAN GUR

Hot potato is a game in which children form a circle and start passing a hot potato.
The counting starts with the first kid. Every nth toss, the child left with the potato
leaves the game. When a kid leaves the game, it passes the potato forward. This continues
repeating until there is only one kid left.
Create a program that simulates the game of Hot Potato. Print every kid that is removed
from the circle. In the end, print the kid that is left last.

INPUT
Sam John Sara
2
OUTPUT
Removed John
Removed Sam
Last is Sara

INPUT
George Peter Sam John Zak
10
OUTPUT
Removed Zak
Removed Peter
Removed Sam
Removed George
Last is John

INPUT
George Peter Misha Sara Kendal
1
OUTPUT
Removed George
Removed Peter
Removed Misha
Removed Sara
Last is Kendal

*/
import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String children = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());
        String[] split = children.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : split) {
            stack.offer(s);
        }
        while (stack.size() > 1) {

            for (int i = 1; i < counter; i++) {
                stack.offer(stack.poll());
            }
                System.out.println("Removed " + stack.poll());
        }
        System.out.println("Last is "+ stack.poll());
    }
}
