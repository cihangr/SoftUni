import java.util.Scanner;
/*
@CIHAN GUR

Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
A top number holds the following properties:

· Its sum of digits is divisible by 8, e.g. 8, 16, 88.
· Holds at least one odd digit, e.g. 232, 707, 87578.

 */
public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        getTopNumber(N);
    }

    public static void getTopNumber(int n){
        for (int i = 8; i <= n; i++) {
                int loop=i;
                int total=0;
                boolean odd=false;
                while (!(loop ==0)){
                    int lastdigit=loop%10;
                    if (lastdigit%2!=0){
                        odd=true;
                    }
                    loop-=lastdigit;
                    loop/=10;
                    total+=lastdigit;
                }
                if (total%8==0 && odd){
                    System.out.println(i);
                }
        }
    }
}
