import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nameOfSeries = inp.nextLine();
        double seriesDuration = inp.nextDouble();
        double breakDuration = inp.nextDouble();
        double rest = breakDuration- (breakDuration/8)-(breakDuration/4);
        if (rest>=seriesDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",nameOfSeries,Math.ceil(rest-seriesDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfSeries,Math.ceil(seriesDuration-rest));
        }
    }
}
