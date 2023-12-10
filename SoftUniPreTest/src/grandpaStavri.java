import java.util.Scanner;

public class grandpaStavri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = Integer.parseInt(input.nextLine());
        double totalLiter=0, degrees, brandyLiter, degreesPerLiter, totalDegreesPerLiter=0, strength;

        for (int i=1; i<=days; i++){
            brandyLiter = Double.parseDouble(input.nextLine());
            totalLiter+=brandyLiter;
            degrees=Double.parseDouble(input.nextLine());
            degreesPerLiter=brandyLiter*degrees;
            totalDegreesPerLiter+=degreesPerLiter;
        }
        strength=totalDegreesPerLiter/totalLiter;
        if (strength<38){
            System.out.printf("Liter: %.2f\n",totalLiter);
            System.out.printf("Degrees: %.2f\n",strength);
            System.out.println("Not good, you should baking!");
        } else if (strength>=38 && strength<=42) {
            System.out.printf("Liter: %.2f\n",totalLiter);
            System.out.printf("Degrees: %.2f\n",strength);
            System.out.println("Super!");
        } else {
            System.out.printf("Liter: %.2f\n",totalLiter);
            System.out.printf("Degrees: %.2f\n",strength);
            System.out.println("Dilution with distilled water!");
        }

    }
}
