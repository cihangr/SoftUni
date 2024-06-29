package StacksAndQueues.BasicQueueOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
@CIHAN GUR

You will be given an integer N representing the number of elements to enqueue (add), an integer S
representing the number of elements to dequeue (remove/poll) from the queue, and finally, an integer X,
an element that you should check whether is present in the queue. If it is - prints true on the console,
if it is not - print the smallest element currently present in the queue.

INPUT
5 2 16
1 13 45 32 4
OUTPUT
true
INPUT
4 1 666
666 69 13 420
OUTPUT
13
INPUT
3 3 90
90 90 90
OUTPUT
0
*/
public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N =input[0];
        int S =input[1];
        int X =input[2];
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            queue.offer(number);
        }

        for (int check = 0; check < S; check++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(X)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }


    }
}
