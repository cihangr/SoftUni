package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class sumSeconds {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int first = Integer.parseInt(inp.nextLine());
        int second = Integer.parseInt(inp.nextLine());
        int third = Integer.parseInt(inp.nextLine());
        int totaltime = first+second+third;
        int min = totaltime/60;
        int sec = totaltime%60;
        if (sec<10){
            System.out.printf("%d:%02d" , min , sec);
        } else {
            System.out.printf("%d:%d" , min , sec);
        }
    }
}
