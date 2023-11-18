import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double m = inp.nextDouble();
        double all = (m *7.61);
        double discount = (all * 0.18);
        double total = all - discount;
        System.out.println("The final price is: "+total+" lv.");
        System.out.println("The discount is: "+discount+" lv.");
    }
}