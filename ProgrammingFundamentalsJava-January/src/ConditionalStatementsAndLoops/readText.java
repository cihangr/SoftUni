package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class readText {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        while(!name.equals("Stop")){
            System.out.println(name);
            name = inp.nextLine();
        }
    }
}
