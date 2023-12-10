import java.util.Scanner;

public class catDiet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatPercent =Integer.parseInt(input.nextLine());
        int proteinPercent =Integer.parseInt(input.nextLine());
        int carbonPercent =Integer.parseInt(input.nextLine());
        int totalCalories =Integer.parseInt(input.nextLine());
        int waterPercent =Integer.parseInt(input.nextLine());

        double fat = (totalCalories*fatPercent*0.01)/9;
        double protein = (totalCalories*proteinPercent*0.01)/4;
        double carbonhydrates = (totalCalories*carbonPercent*0.01)/4;
        double totalWeight = fat+protein+carbonhydrates;
        double caloriPerGram = totalCalories/totalWeight;
        double waterCalori= caloriPerGram*(1-(waterPercent*0.01));
        System.out.printf("%.4f",waterCalori);;

    }
}
