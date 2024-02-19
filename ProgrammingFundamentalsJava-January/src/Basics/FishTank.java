import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int length = inp.nextInt();
        int width = inp.nextInt();
        int height = inp.nextInt();
        double percent = inp.nextDouble();
        double liter = length*width*height*0.001;
        double totalwater = liter - (liter*(percent/100));
        System.out.println(totalwater);
    }
}