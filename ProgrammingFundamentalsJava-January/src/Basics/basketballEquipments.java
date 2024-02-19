package Basics;

import java.util.Scanner;

public class basketballEquipments {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double yearlyprice = inp.nextDouble();
        double sneakers = yearlyprice-(yearlyprice*0.4);
        double team = sneakers - (sneakers*0.2);
        double ball = team / 4;
        double accessories = ball / 5;
        double totalcost = yearlyprice+sneakers+team+ball+accessories;
        System.out.println(totalcost);
    }
}