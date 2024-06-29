package StacksAndQueues.MathPotato;

/*
@CIHAN GUR

Rework the previous problem by using a PriorityQueue so that a child is removed only
on a composite (not prime) cycle (cycles start from 1).
If a cycle is prime, print the child's name.
As before, print the name of the child that is left last.

INPUT
Maria Peter George
2
OUTPUT
Removed George
Prime Maria
Prime Maria
Removed Maria
Last is Peter

INPUT
George Peter Misha Sara Kendal
10
OUTPUT
Removed George
Prime Kendal
Prime Kendal
Removed Kendal
Prime Misha
Removed Misha
Prime Peter
Removed Peter
Last is Sara

*/

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String children = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        String[] split = children.split(" ");
        PriorityQueue<String> stack = new PriorityQueue<>();
        for (String s : split) {
            stack.offer(s);
        }
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String q : stack){
            queue.offer(q);
        }
        while (queue.size() > 1) {
            for (int i = 0; i < counter; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)){
                System.out.println("Prime "+queue.peek());
            } else {
                System.out.println("Removed "+queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is "+ queue.poll());
    }
    private static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                return true;
            }
        }
        return false;
    }
}
