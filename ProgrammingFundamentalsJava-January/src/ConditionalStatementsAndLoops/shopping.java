package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budget = Double.parseDouble(inp.nextLine());
        int videoCard = Integer.parseInt(inp.nextLine());
        int processors = Integer.parseInt(inp.nextLine());
        int ram = Integer.parseInt(inp.nextLine());
        double priceOfVideoCards = videoCard*250;
        double finalbill = priceOfVideoCards+(processors*(priceOfVideoCards*0.35))+(ram*(priceOfVideoCards*0.1));
        if (videoCard>processors){
            finalbill-=(finalbill*0.15);
        }
        if (finalbill<=budget){
            System.out.printf("You have %.2f leva left!",(budget-finalbill));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!",(finalbill-budget));
        }
    }
}
