import java.util.Scanner;
/*
@CIHAN GUR

Write a program that prints whether a given character is upper-case or lower-case.
 */
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        String k = s;
        k=k.toLowerCase();
        if (s.equals(k)){
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
