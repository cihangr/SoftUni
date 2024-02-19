import java.util.Scanner;

/*
@CIHAN GUR

Write a method that returns the English name of the last digit of a given number.
Write a program that reads an integer and prints the returned value from this method.
 */
public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = Integer.parseInt(inp.nextLine());
        int lastdigit = number%10;
        switch (lastdigit){
            case 1 : System.out.println("one"); break;
            case 2 : System.out.println("two"); break;
            case 3 : System.out.println("three"); break;
            case 4 : System.out.println("four"); break;
            case 5 : System.out.println("five"); break;
            case 6 : System.out.println("six"); break;
            case 7 : System.out.println("seven"); break;
            case 8 : System.out.println("eight"); break;
            case 9 : System.out.println("nine"); break;
            case 0 : System.out.println("zero"); break;
            default: System.out.println("Error!"); break;
        }
    }
}
