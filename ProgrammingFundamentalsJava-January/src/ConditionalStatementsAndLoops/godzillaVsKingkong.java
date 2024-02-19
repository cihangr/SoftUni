import java.util.Scanner;

public class godzillaVsKingkong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budget = inp.nextDouble();
        double extras = inp.nextDouble();
        double extraCost = inp.nextDouble();
        double decor = budget*0.1;
        double expenses;
        if (extras>=150) {
            expenses = extras * extraCost*0.9;
        } else {
            expenses = extras * extraCost;

        }
        double total = budget-(decor+expenses);
        if (total>=0){
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",total);
        } else {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.",(-total));
        }
    }
}
