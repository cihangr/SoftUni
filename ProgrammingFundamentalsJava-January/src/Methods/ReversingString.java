package Methods;

import java.util.*;

class ReversingString {

    public static String FirstReverse(String str) {
        String reversed="";
        for(int i=str.length()-1; i>=0; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}