import java.util.Scanner;

public class tradeCommisions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String city = inp.nextLine();
        double volume = Double.parseDouble(inp.nextLine());
        double comission=0;
        if (volume<0){
            System.out.println("error");
        } else if (volume>=0 && volume<=500){
            switch (city){
                case "Sofia": comission = 0.05;break;
                case "Varna": comission = 0.045;break;
                case "Plovdiv": comission = 0.055;break;
                default:
                    System.out.println("error");
            }
        } else if (volume>500 && volume<=1000) {
            switch (city){
                case "Sofia": comission = 0.07;break;
                case "Varna": comission = 0.075;break;
                case "Plovdiv": comission = 0.08;break;
                default:
                    System.out.println("error");
            }
        } else if (volume>1000 && volume<=10000) {
            switch (city){
                case "Sofia": comission = 0.08;break;
                case "Varna": comission = 0.10;break;
                case "Plovdiv": comission = 0.12;break;
                default:
                    System.out.println("error");
            }
        } else {
            switch (city){
                case "Sofia": comission = 0.12;break;
                case "Varna": comission = 0.13;break;
                case "Plovdiv": comission = 0.145;break;
                default:
                    System.out.println("error");
            }
        }
        if (comission==0){
            System.out.println(" ");
        } else {
            System.out.printf("%.2f",(volume*comission));
        }
    }
}
