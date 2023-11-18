import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inch = input.nextDouble();
        double cm = inch * 2.54;
        System.out.println(cm);
    }
}