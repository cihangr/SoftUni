import java.util.Scanner;

/*
@CIHAN GUR

Write a program that receives an array and the number of rotations you
have to perform (the first element goes at the end). Print the resulting array.

 */
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] arr = inp.nextLine().split(" ");
        int n = Integer.parseInt(inp.nextLine());
        n=n% arr.length;
        String[] newArr = new String[arr.length];
        for (int i = n; i < arr.length; i++) {
            newArr[i-n]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            newArr[arr.length-n+i]=arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}