/*
@CIHAN GUR

Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
and on the next two lines receives two numbers. Create four methods (for each calculation) and
invoke the right one depending on the command. The method should also print the result
(it needs to be void).
 */

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String command = scanner.nextLine();
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        calculate(command,firstNumber,secondNumber);
    }

    public static void calculate (String command, double first, double second){
        double result=0;
        switch (command){
            case "add": result=first+second; break;
            case "subtract": result=first-second; break;
            case "multiply": result=first*second; break;
            case "divide": result=first/second; break;
        }
        System.out.printf("%.0f",result);
    }
}
