import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        double nylon = inp.nextDouble();
        double paint = inp.nextDouble();
        double thinner = inp.nextDouble();
        double craftsman = inp.nextDouble();
        double cost = ((nylon+2)*1.5)+((paint+(paint*0.1))*14.5)+(thinner*5)+0.4;
        double workers = (cost * 0.3)*craftsman;
        double total = cost + workers;
        System.out.println(total);

    }
}