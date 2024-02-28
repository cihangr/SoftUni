package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String stopper = inp.nextLine();
        int min= Integer.MAX_VALUE;
        while (!stopper.equals("Stop")){
            int entered = Integer.parseInt(stopper);
            if (entered<min){
                min=entered;
            }
            stopper = inp.nextLine();
        }
        System.out.println(min);
    }
}
