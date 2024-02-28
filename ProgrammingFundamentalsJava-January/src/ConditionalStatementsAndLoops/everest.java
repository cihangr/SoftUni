package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class everest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day=1, climb, totalClimb=5364;
        String ascent =input.nextLine();
        while (!ascent.equals("END")){
            if (day==5){
                break;
            }
            if (ascent.equals("Yes")){
                day++;
                climb=Integer.parseInt(input.nextLine());
                totalClimb+=climb;
            } else if (ascent.equals("No")) {
                climb=Integer.parseInt(input.nextLine());
                totalClimb+=climb;
            }
            if (totalClimb>=8848){
                break;
            }
            ascent=input.nextLine();
        }
        if (totalClimb>=8848){
            System.out.printf("Goal reached for %d days!",day);
        } else {
            System.out.printf("Failed!\n%d",totalClimb);
        }
    }

}
