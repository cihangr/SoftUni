package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class numbers1toNwithStep3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        for (int i=1; i<=N; i+=3){
            System.out.println(i);
        }
    }
}
