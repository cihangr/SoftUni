package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String month = inp.nextLine();
        int night = Integer.parseInt(inp.nextLine());
        double studio=0, apartment=0, studioDiscount=0,apartmentDiscount=0, apartmentPrice, studioPrice;

        if (month.equals("May") || month.equals("October")){
            apartment=65;
            studio=50;
            if (night>7 && night<14){
                studioDiscount=0.05;
            } else if (night>14) {
                studioDiscount=0.30;
                apartmentDiscount=0.10;
            }
        } else if (month.equals("June") || month.equals("September")) {
            apartment=68.7;
            studio=75.2;
            if (night>14){
                studioDiscount=0.20;
                apartmentDiscount=0.10;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio=76;
            apartment=77;
            if (night>14){
                apartmentDiscount=0.10;
            }
        }
        apartmentPrice=apartment*night*(1-apartmentDiscount);
        studioPrice=studio*night*(1-studioDiscount);
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",apartmentPrice,studioPrice);


    }
}
