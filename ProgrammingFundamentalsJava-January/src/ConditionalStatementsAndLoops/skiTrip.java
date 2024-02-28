package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int days = Integer.parseInt(inp.nextLine());
        String type = inp.nextLine();
        String assessment = inp.nextLine();
        int room=0;
        double discount=0, bill;

        switch (type){
            case "room for one person": room=18; break;
            case "apartment": room=25;
                if (days<=10){
                    discount=0.3;
                } else if (days<=15) {
                    discount=0.35;
                }else{
                    discount=0.50;
                }
                break;
            case "president apartment": room=35;
                if (days<=10){
                    discount=0.1;
                } else if (days<=15) {
                    discount=0.15;
                }else{
                    discount=0.20;
                }
                break;
        }
        bill = room * (days-1) * (1-discount);
        if (assessment.equals("positive")){
            bill=bill+(bill*0.25);
        } else if (assessment.equals("negative")){
            bill=bill-(bill*0.10);
        }
        System.out.printf("%.2f",bill);

    }
}
