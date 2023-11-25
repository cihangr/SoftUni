import java.util.Scanner;

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String day = inp.nextLine();
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("16");
                break;
            default:
                System.out.println("error");
        }
    }
}
