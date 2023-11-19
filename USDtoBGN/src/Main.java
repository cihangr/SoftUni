import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double USD = inp.nextDouble();
        double BGN = USD * 1.79549;
        System.out.println(BGN);
    }
}