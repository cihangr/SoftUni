import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budget = Double.parseDouble(inp.nextLine());
        String season = inp.nextLine();
        double cost=0;
        String vacationType = "", destination="";
        if (budget<=100){
            destination = "Bulgaria";
            switch (season){
                case "summer": cost=budget*0.30; vacationType="Camp"; break;
                case "winter": cost=budget*0.70; vacationType="Hotel"; break;
                default: System.out.println("error"); break;
            }
            System.out.printf("Somewhere in %s\n%s - %.2f",destination,vacationType,cost);
        } else if (budget<=1000) {
            destination = "Balkans";
            switch (season){
                case "summer": cost=budget*0.40; vacationType="Camp"; break;
                case "winter": cost=budget*0.80; vacationType="Hotel"; break;
                default: System.out.println("error"); break;
            }
            System.out.printf("Somewhere in %s\n%s - %.2f",destination,vacationType,cost);
        } else {
            destination = "Europe";
            switch (season){
                case "summer": cost=budget*0.90; vacationType="Hotel"; break;
                case "winter": cost=budget*0.90; vacationType="Hotel"; break;
                default: System.out.println("error"); break;
            }
            System.out.printf("Somewhere in %s\n%s - %.2f",destination,vacationType,cost);
        }
    }
}
