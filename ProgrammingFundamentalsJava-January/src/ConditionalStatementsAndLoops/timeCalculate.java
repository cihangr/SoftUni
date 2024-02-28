package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class timeCalculate {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int h = inp.nextInt();
        int m = inp.nextInt();
        if (h>=0 && h<24 && m>=0 && m<60) {
            m +=15;
            if (m>59){
                h+=1;
                m=(m%60);
                if (h>23){
                    h=(h%24);
                }
            }
        } else {
            System.out.println("Wrong Numbers Entered");
        }
        System.out.printf("%d:%02d",h,m);
    }

}
