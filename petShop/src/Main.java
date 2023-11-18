import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dog = inp.nextInt();
        int cat = inp.nextInt();
        double total = (dog*2.5)+(cat*4);
        System.out.println(total);
    }
}