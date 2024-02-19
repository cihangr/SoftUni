import java.util.Scanner;

/*
@CIHAN GUR

Write a program that safely compares floating-point numbers (double) with
precision eps = 0.000001. Note that we cannot directly compare two
floating-point numbers a and b by a==b because of the nature of the
floating-point arithmetic. Therefore, we assume two numbers are equal
if they are closer to each other than some fixed constant eps.

You will receive two lines, each containing a floating-point number.
Your task is to compare the values of the two numbers.

 */
public class FloatingEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        if (Math.abs(firstNumber-secondNumber)<=0.000001){
            System.out.println("True");;
        } else {
            System.out.println("False");
        }

    }
}
