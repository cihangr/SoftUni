import java.util.Scanner;

public class specialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        for (int i=1111; i<=9999; i++) {
            int a = i % 10;
            int threeDigiti = (i - a) / 10;
            int b = threeDigiti % 10;
            int twoDigiti = (threeDigiti - b) / 10;
            int c = twoDigiti % 10;
            int d = (twoDigiti - c) / 10;
            if (a!=0 && b!=0 && c!=0 && d!=0 && N%a==0 && N%b==0 && N%c==0 && N%d==0){
                System.out.print(i+" ");
            }
        }

    }
}
