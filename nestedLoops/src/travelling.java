import java.util.Scanner;
public class travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destionation = scanner.nextLine();
        while (!destionation.equals("End")) {
            double needMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < needMoney) {
                double sum  = Double.parseDouble(scanner.nextLine());
                savedMoney += sum;
            }
            System.out.println("Going to "+destionation+"!");
            destionation = scanner.nextLine();
        }

    }
}
