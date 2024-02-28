package MidExamPrep;

import java.util.Scanner;

public class familyHoliday {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budget = Double.parseDouble(inp.nextLine());
        double night = Double.parseDouble(inp.nextLine());
        double price = Double.parseDouble(inp.nextLine());
        int extra = Integer.parseInt(inp.nextLine());
        double totalBill, extraCost;

        extraCost=budget*extra*0.01;
        if (night>7){
            night=night*0.95;
        }
        totalBill = (price*night)+extraCost;
        if (totalBill>budget){
            System.out.printf("%.2f leva needed.",totalBill-budget);
        } else {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-totalBill);
        }
    }
}
