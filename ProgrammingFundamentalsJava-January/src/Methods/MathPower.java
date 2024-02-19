import java.util.Scanner;
/*
@CIHAN GUR
Create a method that calculates and returns the value of
a number raised to a given power.
 */
public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(calPower(num,power));
    }
    public static long calPower(int n, int p){
        return (long) Math.pow(n,p);
    }
}
