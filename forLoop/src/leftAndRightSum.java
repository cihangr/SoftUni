import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int t1=0,t2=0;
        for (int i=1; i<=N; i++){
            int a = Integer.parseInt(inp.nextLine());
            t1+=a;
        }
        for (int i=1; i<=N; i++){
            int b = Integer.parseInt(inp.nextLine());
            t2+=b;
        } 
        if (t1==t2){
            System.out.printf("Yes, sum = %d",t1);
        } else {
            System.out.printf("No, diff = %d",Math.abs(t1-t2));
        }

    }
}
