import java.util.*;
import java.io.*;

class Main {

    public static int FirstFactorial(int num) {
        for(int i=num-1; i>0; i--){
            num*=i;
        }
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }

}