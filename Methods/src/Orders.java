import java.util.Scanner;

/*
@CIHAN GUR

Write a method that calculates the total price of an order and prints it on the console.
The method should receive one of the following products: coffee, water, coke, snacks,
and a quantity of the product. The prices for a single piece of each product are:

· "coffee" – 1.50
· "water" – 1.00
· "coke" – 1.40
· "snacks" – 2.00

Print the result rounded to the second decimal place.
 */
public class Orders {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String order = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        calculate(order,amount);
    }

    public static void calculate (String order, double amount){
        double price=0;
        switch (order){
            case "coffee": price=1.5; break;
            case "water": price=1.00; break;
            case "coke": price=1.4; break;
            case "snacks": price=2.0; break;
        }
        System.out.printf("%.2f",(price*amount));
    }
}
