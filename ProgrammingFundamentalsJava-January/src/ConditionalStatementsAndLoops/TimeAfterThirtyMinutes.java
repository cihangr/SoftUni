import java.util.Scanner;

/*   @cihangr

Write a program that:
Reads two integer numbers: current hours and current minutes
Calculate time after 30 minutes
Print on the console calculated time in the format "hh:mm"
Note: The hours have one or two digits, and the minutes always have two digits (with leading zero).
Constraints
The current hours will be between 0 and 23.
The current minutes will be between 0 and 59.
 */
public class TimeAfterThirtyMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = Integer.parseInt(input.nextLine());
        int mins = Integer.parseInt(input.nextLine());
        if (hour<0 || hour>23 || mins<0 || mins>59){
            System.out.println("Given time is not correct!");
            return;
        }
        int total = hour*60 + mins;
        total+=30;
        int hour2 =(total/60);
        int mins2 = total-hour2*60;
        if (hour2>23){
            hour2-=24;
        }
        System.out.printf("%d:%02d",hour2,mins2);
    }
}
