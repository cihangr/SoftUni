import java.util.Scanner;

public class numberSequence {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int maxNumber=Integer.MIN_VALUE, minNumber=Integer.MAX_VALUE;
        for (int i=1; i<=N; i++){
            int number = Integer.parseInt(inp.nextLine());
            if (number>maxNumber){
                maxNumber=number;
            }
            if (number<minNumber){
                minNumber=number;
            }
        }
        System.out.println("Max number: "+maxNumber);
        System.out.println("Min number: "+minNumber);
    }
}
