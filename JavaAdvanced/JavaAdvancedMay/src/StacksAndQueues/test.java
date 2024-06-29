package StacksAndQueues;

import StacksAndQueues.PrinterQueue.PrinterQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int DeckSize = stack.size();
        boolean isEmpty = stack.isEmpty();
        boolean exists = stack.contains(1);
        System.out.println(DeckSize);
        System.out.println(isEmpty);
        System.out.println(exists);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println("----------------------------------------");

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(13);
        priorityQueue.offer(74);
        priorityQueue.offer(46);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        System.out.println("----------------------------------------");

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(13);
        queue.offer(74);
        queue.offer(46);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
