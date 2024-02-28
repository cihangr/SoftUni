package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int examHour = Integer.parseInt(inp.nextLine());
        int examMin = Integer.parseInt(inp.nextLine());
        int arrHour = Integer.parseInt(inp.nextLine());
        int arrMin = Integer.parseInt(inp.nextLine());
        int examTime = (examHour*60)+examMin;
        int arrTime = (arrHour*60)+arrMin;
        int diff = Math.abs(examTime-arrTime);

        if (examTime<arrTime){
            System.out.println("Late");
            if (diff<60){
                System.out.printf("%d minutes after the start",diff);
            } if (diff>=60){
                System.out.printf("%d:%02d hours after the start",(diff/60),(diff%60));
            }
        } else if (examTime==arrTime || diff<=30) {
            System.out.println("On time");
            if (diff!=0){
                System.out.printf("%d minutes before the start",diff);
            }
        } else {
            System.out.println("Early");
            if (diff<60){
                System.out.printf("%d minutes before the start",diff);
            } if (diff>=60){
                System.out.printf("%d:%02d hours before the start",(diff/60),(diff%60));
            }
        }
    }
}
