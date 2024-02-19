import java.util.Scanner;

/*
@CIHAN GUR

We are placing N orders at a time. You need to calculate the price on the following formula:
((daysInMonth * capsulesCount) * pricePerCapsule)

Input / Constraints

On the first line, you will receive integer N – the count of orders the shop will receive.
For each order, you will receive the following information:

> Price per capsule - floating-point number in the range [0.00…5000.00].
> Days – integer in the range [1…31].
> Capsules count - integer in the range [0…7000000].

The input will be in the described format, there is no need to check it explicitly.

Output

The output should consist of N + 1 line. For each order, you must print a single
line in the following format:
· "The price for the coffee is: ${price}"
On the last line, you need to print the total price in the following format:
· "Total: ${totalPrice}"
The price must be formatted to 2 decimal places.

 */
public class Orders {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int order = Integer.parseInt(inp.nextLine());
        double totalPrice=1, orderTotals=0;
        while (order>0){
            double perCapsule = Double.parseDouble(inp.nextLine());
            int days = Integer.parseInt(inp.nextLine());
            int capsuleCount = Integer.parseInt(inp.nextLine());
            if (days>27 && days<=31 && perCapsule>0){
                totalPrice=perCapsule*days*capsuleCount;
            } else {
                System.out.println("Error!");
                return;
            }
            order--;
        System.out.printf("The price for the coffee is: $%.2f\n",totalPrice);
        orderTotals+=totalPrice;
        }
        System.out.printf("Total: $%.2f",orderTotals);
    }
}
