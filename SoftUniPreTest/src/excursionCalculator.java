import java.util.Scanner;

public class excursionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peopleNum = Integer.parseInt(input.nextLine());
        String season = input.nextLine();
        double pricePerPerson=0, discount=0, totalPrice;
        switch (season){
            case "spring" :
                if (peopleNum<=5){
                    pricePerPerson=50;
                    break;
                } else {
                    pricePerPerson=48;
                    break;
                }
            case "summer" :
                if (peopleNum<=5){
                    pricePerPerson=48.5;
                    break;
                } else {
                    pricePerPerson=45;
                    break;
                }
            case "autumn" :
                if (peopleNum<=5){
                    pricePerPerson=60;
                    break;
                } else {
                    pricePerPerson=49.5;
                    break;
                }
            case "winter" :
                if (peopleNum<=5){
                    pricePerPerson=86;
                    break;
                } else {
                    pricePerPerson=85;
                    break;
                }
        }
        if (season.equals("summer")){
            discount=0.15;
        }
        if (season.equals("winter")){
            discount=-0.08;
        }
        totalPrice= peopleNum*pricePerPerson*(1-discount);
        System.out.printf("%.2f leva.",totalPrice);

    }
}
