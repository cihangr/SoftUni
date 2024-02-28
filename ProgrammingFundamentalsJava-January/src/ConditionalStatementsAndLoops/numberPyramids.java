package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class numberPyramids {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        int current=1;
        boolean isBigger= false;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (current>n){
                   isBigger=true;
                   break;
                }
                System.out.print(current+" ");
                current++;
            }
            if (isBigger){
                break;
            }
            System.out.println();
        }
    }
}
