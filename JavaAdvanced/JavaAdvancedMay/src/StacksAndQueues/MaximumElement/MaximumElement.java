package StacksAndQueues.MaximumElement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
@CIHAN GUR

You have an empty sequence, and you will be given N commands. Each command is one of the following types:
"1 X" - Push the element X into the stack.
"2" - Delete the element present at the top of the stack.
"3" - Print the maximum element in the stack.
Input
The first line of input contains an integer N, where 1 ≤ N ≤ 105.
The next N lines contain commands. All commands will be valid and in the format described.
The element X will be in the range 1 ≤ X ≤ 109.
The type of the command will be in the range 1 ≤ Type ≤ 3.
Output
For each command of type "3", print the maximum element in the stack on a new line.


INPUT
9
1 97
2
1 20
2
1 26
1 20
3
1 91
3
OUTPUT
26
91

INPUT
7
1 81
2
1 14
2
1 14
1 47
3
OUTPUT
47
*/
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (N>0){
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int command = line[0];


            switch (command){
                case 1: int value = line[1]; stack.push(value); break;
                case 2: stack.pop(); break;
                case 3: System.out.println(Collections.max(stack));; break;
            }
            N--;
        }

    }
}
