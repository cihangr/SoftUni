import java.text.DecimalFormat;
import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner inp = new Scanner(System.in);
        double coins = Double.parseDouble(inp.nextLine());
        int twoLevs, oneLev, fiftyCents, twentyCents, tenCents, fiveCents, twoCents, oneCent;
        int counter=0;
        while (coins>=2) {
            coins-=2;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=1) {
            coins-=1;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.5) {
            coins-=0.5;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.2) {
            coins-=0.2;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.1) {
            coins-=0.1;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.05) {
            coins-=0.05;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.02) {
            coins-=0.02;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }
        while (coins>=0.01) {
            coins-=0.01;
            coins = Double.parseDouble(df.format(coins));
            counter++;
        }

        System.out.println(counter);

    }
}
