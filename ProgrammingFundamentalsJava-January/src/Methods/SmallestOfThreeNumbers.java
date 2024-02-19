import java.util.Scanner;
/*
@CIHAN GUR

Get the smallest of three entered number.
*/

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println(getSmallest(first,second,third));
    }
    public static int getSmallest(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
