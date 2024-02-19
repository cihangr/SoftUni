import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int sum=0;
        for (int i=1; i<=N; i++){
            int number = Integer.parseInt(inp.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
