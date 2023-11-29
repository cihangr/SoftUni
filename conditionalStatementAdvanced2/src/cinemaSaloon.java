import java.util.Scanner;

public class cinemaSaloon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String cinemaRoom = inp.nextLine();
        int c = Integer.parseInt(inp.nextLine());
        int r = Integer.parseInt(inp.nextLine());
        double ticket=0;
        switch (cinemaRoom){
            case "Premiere": ticket=12.0; break;
            case "Normal": ticket=7.5; break;
            case "Discount": ticket=5.0; break;
        }
        if (ticket==0){
            System.out.println(" ");
        } else {
            double revenue = c * r * ticket;
            System.out.printf("%.2f",revenue);
        }

    }
}
