package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class weekendOrWeekday {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String day = inp.nextLine();
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working Day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
