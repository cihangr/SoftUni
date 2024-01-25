import java.util.Scanner;

/*
@CIHAN GUR

Write a program that:

· Reads an integer number that represents meters for conversion

· Convert meters to kilometers (1000 meters = 1 kilometer)

· Print the resulted kilometers, formatted to the second decimal point
 */
public class ConvertMeterToKilometer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int meter = inp.nextInt();
        double km = (double)meter/1000;
        System.out.printf("%.2f",km);

    }
}
