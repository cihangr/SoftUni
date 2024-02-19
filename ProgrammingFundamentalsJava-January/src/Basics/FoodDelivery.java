import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double meatfood = inp.nextDouble();
        double fishfood = inp.nextDouble();
        double vegfood = inp.nextDouble();
        double cost = (meatfood*10.35)+(fishfood*12.4)+(vegfood*8.15);
        double desert = cost * 0.2;
        double total = cost + desert + 2.5;
        System.out.println(total);
    }
}