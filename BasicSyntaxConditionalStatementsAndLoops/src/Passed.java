import java.util.Scanner;

/*   @cihangr

Write a program that:
Read a floating-point number, which represents a grade
If the grade is equal or more than 3.00, print "Passed!"
 */
public class Passed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double newgrade = Double.parseDouble(input.nextLine());
        if (newgrade>=3.00){
            System.out.println("Passed!");
        }
    }
}
