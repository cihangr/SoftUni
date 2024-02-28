package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int trainers = Integer.parseInt(input.nextLine());
        String lesson = input.nextLine();
        double total=0;
        int counter=0;
        while (!lesson.equals("Finish")){
            double sum=0;
            for (int i=0; i<trainers; i++) {
                double note = Double.parseDouble(input.nextLine());
                sum+=note;
            }
            System.out.printf("%s - %.2f.\n",lesson,sum/trainers);
            total+=(sum/trainers);
            counter++;
            lesson=input.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",total/counter);
    }
}
