package Basics;

import java.util.Scanner;

public class RadiansToDegree {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double radian = inp.nextDouble();
        double degree = radian * (180/Math.PI);
        System.out.println(degree);
    }
}