import java.util.Scanner;
/*
@CIHAN GUR
Write a method that receives a string and a repeat count n (integer).
The method should return a new string (the old one repeated n times).
 */
public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        printRepeat(s,repeat);
    }

    public static void printRepeat(String s, int r){
        for (int i = 0; i < r; i++) {
            System.out.print(s);
        }
    }

}
