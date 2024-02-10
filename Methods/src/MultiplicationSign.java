import java.util.Scanner;
/*
@CIHAN GUR

You are given a number num1, num2, and num3. Write a program that finds if
num1 * num2 * num3 (the product) is negative, positive, or zero. Try to do
this WITHOUT multiplying the 3 numbers

 */
public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println(revealSign(first,second,third));
    }
    public static String revealSign(int i1, int i2, int i3){
        int counter=0;
        if (i1==0 || i2==0 || i3==0){
            return "0";
        }
        if (i1<0){
            counter++;
        }
        if (i2<0){
            counter++;
        }
        if (i3<0){
            counter++;
        }
        if (counter%2==0) return "positive";
        else return "negative";
    }
}
