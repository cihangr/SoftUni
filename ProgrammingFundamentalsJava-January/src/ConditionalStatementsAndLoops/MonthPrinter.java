/*
@cihangr

Write a program that:
Reads an integer from the console
Print the corresponding month:
1 -> "January"
2 -> "February"
3 -> "March"
4 -> "April"
5 -> "May"
6 -> "June"
7 -> "July"
8 -> "August"
9 -> "September"
10 -> "October"
11 -> "November"
12 -> "December"
Print "Error!", if the number is more than 12 or less than 1
 */

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = Integer.parseInt(input.nextLine());
        switch (month){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
