import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int t1=0,t2=0;
        for (int i=1; i<=N; i++){
            if ((i%2)==0){
                int a = Integer.parseInt(inp.nextLine());
                t1+=a;
            } else {
                int b = Integer.parseInt(inp.nextLine());
                t2+=b;
            }
        }
        if (t1==t2){
            System.out.printf("Yes\nSum = %d",t1);
        } else {
            System.out.printf("No\nDiff = %d",Math.abs(t1-t2));
        }
    }
}
