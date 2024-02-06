import java.util.Scanner;

/*
@CIHAN GUR

You will receive 3 integers. Write a method sum to get the sum of the first two
integers and subtract the method that subtracts the third integer from the
result from the sum method.

 */
public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();
        System.out.println(subtract(sum(i1,i2),i3));;
    }
    public static int sum (int i1 , int i2){
        return i1+i2;
    }
    public static int subtract(int s1 , int s2){
        return s1-s2;
    }
}
