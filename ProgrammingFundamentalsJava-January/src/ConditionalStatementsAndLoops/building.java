package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class building {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int floor = Integer.parseInt(input.nextLine());
        int rooms = Integer.parseInt(input.nextLine());
        String oddEven="";
        for (int i=floor; i>0; i--){
            for (int j=0; j<rooms; j++){
                if (i%2!=0 && i!=floor){
                    oddEven="A";
                } else if (i%2==0 && i!=floor) {
                    oddEven="O";
                } else {
                    oddEven="L";
                }
                System.out.printf("%s%d%d ",oddEven,i,j);
            }
            System.out.println();
        }

    }
}
