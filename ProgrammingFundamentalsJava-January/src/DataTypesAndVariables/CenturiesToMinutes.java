import java.util.Scanner;
/*
@CIHAN GUR

Write a program to enter an integer number of centuries and convert
it to years, days, hours, and minute
 */

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int century = inp.nextInt();
        double year = century*100;
        double days = year *365.2422;
        double hours = days *24;
        double min = hours*60;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",century,year,days,hours,min);
    }
}
