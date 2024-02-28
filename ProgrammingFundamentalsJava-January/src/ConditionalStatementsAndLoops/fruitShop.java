package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String fruit = inp.nextLine();
        String weekday = inp.nextLine();
        double quantity = Double.parseDouble(inp.nextLine());
        double price=0;
        switch (weekday) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana": price=2.5;break;
                    case "apple": price=1.2;break;
                    case "orange": price=0.85;break;
                    case "grapefruit": price=1.45;break;
                    case "kiwi": price=2.70;break;
                    case "pineapple": price=5.5;break;
                    case "grapes": price=3.85;break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;

            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana": price=2.7;break;
                    case "apple": price=1.25;break;
                    case "orange": price=0.9;break;
                    case "grapefruit": price=1.6;break;
                    case "kiwi": price=3.0;break;
                    case "pineapple": price=5.6;break;
                    case "grapes": price=4.2;break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if (price==0){
            System.out.println(" ");
        } else {
            double bill = quantity * price;
            System.out.printf("%.2f", bill);
        }
    }
}
