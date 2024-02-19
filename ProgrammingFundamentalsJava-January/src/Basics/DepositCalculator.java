package Basics;

import java.util.Scanner;

public class DepositCalculator {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            double deposit = inp.nextDouble();
            int month = inp.nextInt();
            double interest = inp.nextDouble();
            double totalinterest = deposit*(interest/100);
            double monthlyinterest = totalinterest/12;
            double total = deposit + (monthlyinterest* month);
            System.out.println(total);
        }
}
