package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class walking {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int totalSteps=0;
        while (totalSteps<=10000){
                String command = inp.nextLine();
            if (command.equals("Going home")){
                int step = Integer.parseInt(inp.nextLine());
                totalSteps+=step;
                if (totalSteps>10000){
                break;
                } else {
                System.out.printf("%d more steps to reach goal.",10000-totalSteps);
                return;
                }
            }
            int step = Integer.parseInt(command);
            totalSteps+=step;

        }
        System.out.println("Goal reached! Good job!");
        System.out.printf("%d steps over the goal!",totalSteps-10000);

    }
}
