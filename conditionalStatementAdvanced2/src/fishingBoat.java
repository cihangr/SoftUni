import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budget = Double.parseDouble(inp.nextLine());
        String season = inp.nextLine();
        int person = Integer.parseInt(inp.nextLine());
        double rent=0;
        switch (season){
            case "Spring": rent=3000; break;
            case "Summer":
            case "Autumn": rent=4200; break;
            case "Winter": rent=2600; break;
        }
        if (person<=6){
            rent=rent-(rent*0.1);
        } else if (person<=11) {
            rent=rent-(rent*0.15);
        } else {
            rent=rent-(rent*0.25);
        }
        if (person%2==0  && !season.equals("Autumn")){
            rent=rent-(rent*0.05);
        }
        if (budget>=rent){
            System.out.printf("Yes! You have %.2f leva left.",(budget-rent));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.",(rent-budget));
        }
    }
}
