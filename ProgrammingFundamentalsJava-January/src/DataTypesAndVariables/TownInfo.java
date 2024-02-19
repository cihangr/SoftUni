import java.util.Scanner;

/*
@CIHAN GUR

You will be given 3 lines of input. On the first line, you will be given the name
of the town, on the second – the population, and on the third – the area. Use the
correct data types and print the result in the following format:

"Town {town name} has population of {population} and area {area} square km.".
 */
public class TownInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String town = inp.nextLine();
        int population = Integer.parseInt(inp.nextLine());
        double area = Double.parseDouble(inp.nextLine());
        System.out.printf("Town %s has population of %d and area %.0f square km.",town,population,area);
    }
}
