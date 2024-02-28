package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shape = scan.nextLine();
        double face=0;

        if (shape.equals("square")){
            double side = scan.nextDouble();
            face = side * side;
        }
        if (shape.equals("rectangle")){
            double width = scan.nextDouble();
            double height = scan.nextDouble();
            face = width*height;
        }
        if (shape.equals("circle")){
            double radius = scan.nextDouble();
            face = radius * radius * Math.PI;
        }
        if (shape.equals("triangle")){
            double side = scan.nextDouble();
            double height = scan.nextDouble();
            face = 0.5 * side * height;
        }
        System.out.println(face);
    }
}
