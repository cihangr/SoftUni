package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String name = inp.nextLine();

        for (int i=0; i<name.length(); i++){
            char letter = name.charAt(i);
            System.out.println(letter);
        }
    }
}
