package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String flower = inp.nextLine();
        int number = Integer.parseInt(inp.nextLine());
        int budget = Integer.parseInt(inp.nextLine());
        double price=0,discount=0,bill;
        switch (flower){
            case "Roses": price=5.0; break;
            case "Dahlias": price=3.8; break;
            case "Tulips": price=2.8; break;
            case "Narcissus": price=3; break;
            case "Gladiolus": price=2.5; break;
            default:
                System.out.println("error"); break;
        }
        if (flower.equals("Roses") && number>80){
            discount=0.1;
        } else if (flower.equals("Dahlias") && number>90) {
            discount=0.15;
        } else if (flower.equals("Tulips") && number>80) {
            discount=0.15;
        } else if (flower.equals("Narcissus") && number<120) {
            discount= -0.15;
        } else if (flower.equals("Gladiolus") && number<80) {
            discount= -0.20;
        }
        bill = price*number*(1-discount);
        if (budget>=bill){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",number,flower,(budget-bill));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",(bill-budget));
        }
    }
}
