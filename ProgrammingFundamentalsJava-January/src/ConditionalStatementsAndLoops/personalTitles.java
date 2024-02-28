package ConditionalStatementsAndLoops;
import java.util.Scanner;

public class personalTitles {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double age = Double.parseDouble(inp.nextLine());
        String gender = inp.nextLine();
        if (gender.equals("m")){
            if (age>=16){
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender.equals("f")){
            if (age>=16){
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("There are only male and female genders. Choose m or f only.");
        }
    }
}
