package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class braceletStand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pocketMoney = Double.parseDouble(input.nextLine());
        double perSalesDay = Double.parseDouble(input.nextLine());
        double spendMoney = Double.parseDouble(input.nextLine());
        double giftPrice = Double.parseDouble(input.nextLine());

        double savedMoney = pocketMoney*5;
        double earnedMoney = perSalesDay*5;
        double totalMoney = savedMoney+earnedMoney-spendMoney;
        if (totalMoney>giftPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",totalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.",giftPrice-totalMoney);
        }



    }
}
