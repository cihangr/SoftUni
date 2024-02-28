package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class workingHours {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int time = Integer.parseInt(inp.nextLine());
        String day = inp.nextLine();
        if (time>=10 && time<=18){
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")){
                System.out.println("open");
            } else if (day.equals("Sunday")) {
                System.out.println("closed");
            } else {
                System.out.println("error");
            }
        } else if (time>24) {
            System.out.println("error");
        } else {
            System.out.println("closed");
        }
    }
}
