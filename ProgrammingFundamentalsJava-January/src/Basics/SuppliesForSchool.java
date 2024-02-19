package Basics;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pens = inp.nextInt();
        int marker = inp.nextInt();
        int detergent = inp.nextInt();
        double discount = inp.nextDouble();
        double total = (pens*5.80)+(marker*7.2)+(detergent*1.2);
        double dprice = total - (total*(discount/100));
        System.out.println(dprice);

    }
}