package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

You are given an array with integers. Write a program to modify the elements after receiving the following commands:
· "swap {index1} {index2}" takes two elements and swap their places.
· "multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
· "decrease" decreases all elements in the array with 1.

Input
On the first input line, you will be given the initial array values separated by a single space.
On the next lines, you will receive commands until you receive the command "end". The commands are as follows:

· "swap {index1} {index2}"
· "multiply {index1} {index2}"
· "decrease"

Output
The output should be printed on the console and consist of elements of the modified array – separated by a comma and a single space ", ".
Constraints

· Elements of the array will be integer numbers in the range [-231...231].
· The count of the array elements will be in the range [2...100].
· Indexes will always be in the range of the array.

 */
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = Arrays.stream(inp.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = inp.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
                int firstNumber = Integer.parseInt(command.split(" ")[1]);
                int secondNumber = Integer.parseInt(command.split(" ")[2]);

                int value1 = arr[firstNumber];
                int value2 = arr[secondNumber];

                arr[firstNumber]=value2;
                arr[secondNumber]=value1;

            } else if (command.contains("multiply")){

                int firstNumber = Integer.parseInt(command.split(" ")[1]);
                int secondNumber = Integer.parseInt(command.split(" ")[2]);

                int value1 = arr[firstNumber];
                int value2 = arr[secondNumber];

                arr[firstNumber]=value1*value2;

            } else if (command.contains("decrease")){

                for (int i = 0; i < arr.length; i++) {
                    arr[i]=arr[i]-1;
                }

            }


            command = inp.nextLine();
        }
        System.out.println(Arrays.toString(arr).replace("[","").replace("]",""));
    }
}