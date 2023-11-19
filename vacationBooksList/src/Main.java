import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pagenum = inp.nextInt();
        int hourlypage = inp.nextInt();
        int vacation = inp.nextInt();
        int days = (pagenum/hourlypage)/vacation;
        System.out.println(days);

    }
}