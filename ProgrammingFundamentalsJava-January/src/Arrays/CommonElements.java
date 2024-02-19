import java.util.Scanner;

/*
@CIHAN GUR

Write a program that prints common elements in two arrays. You have to compare
the elements of the second array to the elements of the first.

 */
public class CommonElements {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] arr1 = inp.nextLine().split(" ");
        String[] arr2 = inp.nextLine().split(" ");

        for(String el1 : arr1){
            for(String el2 :arr2){
                if (el2.equals(el1)){
                    System.out.print(el1+" ");
                }
            }

        }
    }
}