import java.util.Scanner;

/*
@CIHAN GUR

You are given two values of the same type as input. The values can be of
type int, char of String. Create a method getMax() that returns the greater
of the two values:
Input
int
5
4
Output
5

Input
string
tom
jerry
Output
tom

 */
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equals("int")){
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(first,second));
        } else if (command.equals("char")){
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            System.out.println(getMax(first,second));
        } else if (command.equals("string")){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first,second));
        }
    }

    public static int getMax (int first, int second){
        if (first>=second){
            return first;
        } else {
            return second;
        }
    }
    public static char getMax (char first, char second){
        if (first>=second){
            return first;
        } else {
            return second;
        }
    }
    public static String getMax (String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
            return second;
    }
}
