import java.util.Scanner;

/*
@cihangr

A theatre is having a ticket sale, but they need a program to calculate the
price of a single ticket. If the given age does not fit one of the categories,
you should print "Error!". You can see the prices in the table below:
Weekday > 0<=age<=18 12$  >  18<age<=64 18$  >  64<age<=122 12$
Weekend > 0<=age<=18 15$  >  18<age<=64 20$  >  64<age<=122 15$
Holiday > 0<=age<=18 5$   >  18<age<=64 12$  >  64<age<=122 10$

Input
The input comes in two lines. On the first line, you will receive the type of day.
On the second – is the age of the person.

Output
Print the ticket price according to the table, or "Error!" if the age is not in the table.

Constraints
The age will be in the interval [-1000…1000].
The type of day will always be valid.

 */
public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String day = inp.nextLine();
        int age = Integer.parseInt(inp.nextLine());
        int price=0;
        if (age>=0 && age<=18){
            switch (day){
                case "Weekday" : price=12; break;
                case "Weekend" : price=15; break;
                case "Holiday" : price=5; break;
                default:
                    System.out.println("Error!");
            }
        } else if (age>18 && age<=64) {
            switch (day){
                case "Weekday" : price=18; break;
                case "Weekend" : price=20; break;
                case "Holiday" : price=12; break;
                default:
                    System.out.println("Error!");
            }
        } else if (age>64 && age<=122) {
            switch (day){
                case "Weekday" : price=12; break;
                case "Weekend" : price=15; break;
                case "Holiday" : price=10; break;
                default:
                    System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
            return;
        }
        System.out.println(price+"$");
    }
}
