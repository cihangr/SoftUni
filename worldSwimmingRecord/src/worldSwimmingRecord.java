import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double recordTime = Double.parseDouble(inp.nextLine());
        double distance = Double.parseDouble(inp.nextLine());
        double permeter = Double.parseDouble(inp.nextLine());
        double waterResist = Math.floor(distance/15)*12.5;
        double totalTime = (distance*permeter)+waterResist;
        if (totalTime<recordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",(totalTime-recordTime));
        }
    }
}
