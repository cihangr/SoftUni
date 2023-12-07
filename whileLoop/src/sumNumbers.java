import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = Integer.parseInt(inp.nextLine());
        int sum=0;
        while (sum<A){
            int B = Integer.parseInt(inp.nextLine());
            sum+=B;
        }
        System.out.println(sum);
    }
}
