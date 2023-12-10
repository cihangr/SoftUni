import java.util.Scanner;

public class movieDestionation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double budged = Double.parseDouble(inp.nextLine());
        double dayPrice=0, totalPrice, discount=0;
        String destination = inp.nextLine();
        String season= inp.nextLine();
        int dayNum = Integer.parseInt(inp.nextLine());

        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    dayPrice=45000;
                    discount=0.3;
                    break;
                } else if (season.equals(("Summer"))) {
                    dayPrice=40000;
                    discount=0.3;
                    break;
                } else {
                    System.out.println("Error");
                    break;
                }
            case "Sofia" :
                if (season.equals("Winter")){
                    dayPrice=17000;
                    discount=-0.25;
                    break;
                } else if (season.equals(("Summer"))) {
                    dayPrice=12500;
                    discount=-0.25;
                    break;
                } else {
                    System.out.println("Error");
                    break;
                }
            case "London" :
                if (season.equals("Winter")){
                    dayPrice=24000;
                    break;
                } else if (season.equals(("Summer"))) {
                    dayPrice=20250;
                    break;
                } else {
                    System.out.println("Error");
                    break;
                }
            default:
                System.out.println("Error");
                break;
        }

        totalPrice=dayPrice*dayNum*(1-discount);
        if (totalPrice>budged){
            System.out.printf("The director needs %.2f leva more!",totalPrice-budged);
        } else {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budged-totalPrice);
        }

    }
}
