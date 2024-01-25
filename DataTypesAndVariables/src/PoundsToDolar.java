import java.util.Scanner;

/*
@CIHAN GUR

Write a program that:

· Reads an floating-point number that represents quantity of British pounds for conversion

· Convert pounds to dollars (1 British Pound = 1.36 Dollars)

· Print the resulted dollars, formatted to the third decimal point
 */
public class PoundsToDolar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pound = inp.nextDouble();
        System.out.printf("%.3f",(pound*1.36));
    }
}
