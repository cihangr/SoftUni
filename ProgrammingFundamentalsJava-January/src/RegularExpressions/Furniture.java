package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
@CIHAN GUR

Write a program to calculate the total cost of different types of furniture.
You will be given some lines of input until you receive the line "Purchase".
For the line to be valid, it should be in the following format:
">>{furniture name}<<{price}!{quantity}"
The price can be a floating-point number or a whole number. Store the names of
the furniture and the total price. In the end, print each bought furniture on
a separate line in the format:
"Bought furniture:
{1st name}
{2nd name}
…"
And on the last line, print the following: "Total money spend: {spend money}",
formatted to the second decimal point.

INPUT
>>Sofa<<312.23!3
>>TV<<300!5
>Invalid<<!5
Purchase
OUTPUT
Bought furniture:
Sofa
TV
Total money spend: 2436.69

INPUT
>>TV<<312.23!3
>>Monitor<<300!5
>>Invalid<<<<!5
>>Sink<<220!10
>>>>>>Invalid<<!5
Purchase
OUTPUT
Bought furniture:
TV
Monitor
Sink
Total money spend: 4636.69

*/
public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> data = new ArrayList<>();
        double totalPrice = 0;

        String command = scanner.nextLine();
        while(!command.equals("Purchase")){
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                data.add(furniture);
                double furniturePrice = price*quantity;
                totalPrice+=furniturePrice;
            }

            command = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        data.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
