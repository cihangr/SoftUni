package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        int n=1, r=0;
        double avg, grade=0, total=0;
        while (n<=12){
            grade =Double.parseDouble(inp.nextLine());
            if (grade<4.00){
                r++;
                if (r<2){
                    continue;
                } else {
                    System.out.printf("%s has been excluded at %d grade", name,n);
                    return;
                }
            }
            total+=grade;
            n++;
        }
        avg=total/12.0;
        System.out.printf("%s graduated. Average grade: %.2f",name,avg);
    }
}
