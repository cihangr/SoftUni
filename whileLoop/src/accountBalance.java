import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String stopper = inp.nextLine();
        double total=0;

        while (!stopper.equals("NoMoreMoney")){
            double dep = Double.parseDouble(stopper);
            if (dep<=0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n",dep);
            stopper = inp.nextLine();
            total+=dep;
        }

        System.out.printf("Total: %.2f",total);
    }
}
