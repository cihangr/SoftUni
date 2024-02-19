import java.util.Arrays;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program to read an array of strings, reverse it and print
its elements. The input consists of a sequence of space-separated
strings. Print the output on a single line (space separated).

 */
public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        String[] arr = input.split(" ");
        String[] temp = new String[arr.length];
        for (int i=arr.length-1; i>=0; i--){
            temp[i] = arr[arr.length-1-i];
        }
        for (int j=0; j<temp.length; j++) {
            System.out.print(temp[j]+" ");
        }
    }
}