import java.util.Scanner;

public class fruitMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double strawberries = Double.parseDouble(input.nextLine());
        double raspberries = strawberries/2;
        double oranges= raspberries*0.6;
        double bananas = raspberries*0.2;
        double bananaNumber = Double.parseDouble(input.nextLine());
        double orangesNumber = Double.parseDouble(input.nextLine());
        double raspberriesNumber = Double.parseDouble(input.nextLine());
        double straberriesNumber = Double.parseDouble(input.nextLine());
        double price;
        price=(strawberries*straberriesNumber)+(raspberries*raspberriesNumber)+(oranges*orangesNumber)+(bananas*bananaNumber);
        System.out.printf("%.2f",price);
    }

}
