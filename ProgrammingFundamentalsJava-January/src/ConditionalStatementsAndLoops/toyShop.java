package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        double puzzle = 2.6;
        double talkingDoll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        double truck = 2;
        Scanner inp = new Scanner(System.in);
        double holiday = inp.nextDouble();
        double p = inp.nextDouble();
        double ta = inp.nextDouble();
        double te = inp.nextDouble();
        double m = inp.nextDouble();
        double t = inp.nextDouble();
        double total = (p*puzzle)+ (ta*talkingDoll)+ (te*teddyBear)+ (m*minion)+ (t*truck);
        double totalDolls = p+ta+te+m+t;
        if (totalDolls>=50){
            total-=(0.25*total);
        }
        double rent = total*0.1;
        total-=rent;
        if (total>=holiday){
            System.out.printf("Yes! %.2f lv left.",(total-holiday));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",(holiday-total));
        }

    }
}
