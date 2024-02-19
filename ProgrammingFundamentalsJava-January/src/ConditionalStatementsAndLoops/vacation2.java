package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class vacation2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double neededMoney = Double.parseDouble(inp.nextLine());
        double haveMoney = Double.parseDouble(inp.nextLine());
        int daysCounter = 0, spendingCounter=0;

        while (haveMoney<neededMoney && spendingCounter<5){
            String command = inp.nextLine();
            double money = Double.parseDouble(inp.nextLine());
            daysCounter++;
        if ("save".equals(command)){
            haveMoney+=money;
            spendingCounter=0;
        } else if ("spend".equals(command)){
            haveMoney-=money;
            spendingCounter+=1;
            if (haveMoney<0){
                haveMoney=0;
            }
        }
        }
        if (spendingCounter==5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (haveMoney>=neededMoney){
            System.out.printf("You saved the money for %d days.",daysCounter);
        }




    }
}
