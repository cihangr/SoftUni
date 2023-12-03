import java.util.Scanner;

public class evenPowerOf2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int a=1;
        for (int i=0; i<=N; i+=2){
            System.out.println(a);
            a*=4;
        }
    }
}
