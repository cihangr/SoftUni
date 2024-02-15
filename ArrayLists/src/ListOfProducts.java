import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Read a number n and n lines of products. Print a numbered list of all the products ordered by name.
Input
4
Potatoes
Tomatoes
Onions
Apples

Output
1.Apples
2.Onions
3.Potatoes
4.Tomatoes
*/
public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int numberOfProducts = Integer.parseInt(scanner.nextLine());
        int number=1;
        for (int i = 0; i < numberOfProducts; i++) {
            String enteredProduct = scanner.nextLine();
            products.add(enteredProduct);
        }
        Collections.sort(products);
        for (String product : products){
            System.out.println(number+"."+product);
            number++;
        }

    }
}
