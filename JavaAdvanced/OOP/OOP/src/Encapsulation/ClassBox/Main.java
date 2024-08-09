package Encapsulation.ClassBox;

import java.util.Scanner;

/*
@CIHAN GUR

You are given a geometric figure Box with fields length, width, and height. Model a class Box that can be
instantiated by the same three parameters. Expose to the outside world only methods for its surface area,
lateral surface area, and its volume (formulas: http://www.mathwords.com/r/rectangular_parallelepiped.htm).
On the first three lines, you will get the length, width, and height. On the next three lines print the surface
area, lateral surface area, and the volume of the box.
A box’s side should not be zero or a negative number. Add data validation for each parameter given to the
constructor. Make a private setter that performs data validation internally.

>>>>>INPUT
length: double
width:  double
height:  double
>>>>>OUTPUT
Box (double length, double width, double height)
setLength(double): void
setWidth(double): void
setHeight(double): void
calculateSurfaceArea (): double
calculateLateralSurfaceArea (): double
calculateVolume (): double

INPUT
2
-3
4
OUTPUT
Width cannot be zero or negative.


INPUT
2
3
4
OUTPUT
Surface Area - 52.00
Lateral Surface Area - 40.00
Volume – 24.00


INPUT
1.3
1
6
OUTPUT
Surface Area - 30.20
Lateral Surface Area - 27.60
Volume - 7.80
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);

        System.out.printf("Surface Area - %.2f\n", box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n", box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f", box.calculateVolume());
    }
}
