package ConditionalStatementsAndLoops;/*
@CIHAN GUR

Your task is to calculate the total purchase price from a vending machine.
Until you receive "Start" you will be given different coins that are being
inserted into the machine. You have to sum them to have the total money
inserted. There is a problem though. Your vending machine only works with
0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins,
you have to display "Cannot accept {money}", where the value is formatted
to the second digit after the decimal point and not add it to the total money.
On the next few lines until you receive "End" you will be given products to
purchase. Your machine has, however, only
"Nuts" > 2.0
"Water" > 0.7
"Crisps" > 1.5
"Soda" > 0.8
"Coke" > 1.0
If the person tries to purchase a not existing product, print "Invalid product". Be careful
that the person may try to purchase a product for which he doesn't have money.
In that case, print "Sorry, not enough money". If the person purchases a
product successfully print "Purchased {product name}". After the "End" command,
print the money that is left formatted to the second decimal point in the format
"Change: {money left}".
 */

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double coins, total=0, price=0;
        String start=inp.nextLine();
        while (!start.equals("Start")){
            coins = Double.parseDouble(start);
            if (coins==0.1 || coins==0.2 || coins==0.5 || coins==1 || coins==2){
                total+=coins;
            } else {
                System.out.printf("Cannot accept %.2f\n",coins);
            }
            start=inp.nextLine();
        }
        String products = inp.nextLine();
        while (!products.equals("End")){
            switch (products){
                case "Nuts" : price=2.0; break;
                case "Water" : price=0.7; break;
                case "Crisps" : price=1.5; break;
                case "Soda" : price=0.8; break;
                case "Coke" : price=1.0; break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (products.equals("Nuts") || products.equals("Water") || products.equals("Crisps") || products.equals("Soda") || products.equals("Coke")){
                if (total>=price){
                    System.out.printf("Purchased %s\n", products);
                    total-=price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }
            products=inp.nextLine();
        }
        System.out.printf("Change: %.2f",total);

    }
}
