import java.util.Scanner;

/*
@CIHAN GUR

Write a program that reverses a string and prints it on the console.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        StringBuilder reversed= new StringBuilder();
        for (int i=word.length()-1; i>=0; i--){
            reversed.append(word.charAt(i));;
        }
        System.out.println(reversed);
    }
}
