/* @cihangr

You are given a group of people, type of the group, on which day of
the week they will stay. Based on that information, calculate how much
they must pay and print that price on the console. Use the table below.
In each cell is the price for a single person. The output should look
like that: "Total price: {price}". The price should be formatted to
the second decimal point.

Students : Friday;8.45   Saturday;9.80   Sunday;10.46
Business : Friday;10.90   Saturday;15.60   Sunday;16
Regular : Friday;15   Saturday;20   Sunday;22.50

There are also discounts based on some conditions:

Students – if the group is bigger than or equal to 30 people,
you should reduce the total price by 15%

Business – if the group is bigger than or equal to 100 people
10 of them can stay for free.

Regular – if the group is bigger than or equal to 10 and less
than or equal to 20 reduce the total price by 5%

You should reduce the prices in that EXACT order.
*/

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        String type = input.nextLine();
        String day = input.nextLine();
        double total=0, price=0, discount=1;
        if (type.equals("Students")){
            switch (day){
                case "Friday" : price=8.45; break;
                case "Saturday" : price=9.80; break;
                case "Sunday" : price=10.46; break;
                default: break;
            }
            if (number>=30){
                discount=0.85;
            }
        } else if (type.equals("Business")){
            switch (day){
                case "Friday" : price=10.90; break;
                case "Saturday" : price=15.60; break;
                case "Sunday" : price=16; break;
                default: break;
            }
            if (number>=100){
                number-=10;
            }
        }else if (type.equals("Regular")){
            switch (day){
                case "Friday" : price=15; break;
                case "Saturday" : price=20; break;
                case "Sunday" : price=22.5; break;
                default: break;
            }
            if (number>=10 && number<=20){
                discount=0.95;
            }
        } else {
            System.out.println("Invalid input");
        }
        total = number*price*discount;
        System.out.printf("Total price: %.2f", total);
    }
}
