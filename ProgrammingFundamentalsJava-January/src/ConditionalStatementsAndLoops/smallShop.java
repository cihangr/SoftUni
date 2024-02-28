package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String product = inp.nextLine();
        String city = inp.nextLine();
        double quantity = Double.parseDouble(inp.nextLine());
        double price=0;
        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia": price=0.5;break;
                    case "Plovdiv": price=0.4;break;
                    case "Varna": price=0.45;break;
                }
                break;

            case "water":
                switch (city) {
                    case "Sofia": price=0.8;break;
                    case "Plovdiv": price=0.7;break;
                    case "Varna": price=0.7;break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia": price=1.2;break;
                    case "Plovdiv": price=1.15;break;
                    case "Varna": price=1.1;break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia": price=1.45;break;
                    case "Plovdiv": price=1.30;break;
                    case "Varna": price=1.35;break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia": price=1.6;break;
                    case "Plovdiv": price=1.50;break;
                    case "Varna": price=1.55;break;
                }
                break;
            }

        double bill = quantity*price;
        System.out.println(bill);
    }
}
