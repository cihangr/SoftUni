import java.util.Scanner;
/*
@CIHAN GUR

Enter a day number and print the day name (in English) or "Invalid day!".
Use an array of string
 */

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int i = Integer.parseInt(inp.nextLine());
        if (i<=7 && i>=1){
            System.out.println(days[i-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}