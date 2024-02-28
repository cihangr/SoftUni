package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int failing=0, numProbs=0;
        String lessonName, probName="";
        double grade, avg=0, total=0;
        while (N>failing){

            lessonName = inp.nextLine();
            if (lessonName.equals("Enough")){
                System.out.printf("Average score: %.2f\n",avg);
                System.out.printf("Number of problems: %d\n",numProbs);
                System.out.printf("Last problem: %s",probName);
                return;
            }
            grade = Double.parseDouble(inp.nextLine());
            if (grade<=4){
                failing++;
            }
            probName=lessonName;
            total+=grade;
            numProbs++;
            avg = total/numProbs;
        }
        System.out.printf("You need a break, %d poor grades.",failing);
    }
}
