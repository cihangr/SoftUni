import java.util.Scanner;

/*
@CIHAN GUR

Write a program that, depending on the first line of the input, reads an int, double, or string.
· If the data type is int, multiply the number by 2.
· If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
· If the data type is a string, surround the input with "$".
Print the result on the console.

 */
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String input = scanner.nextLine();
        switch (command){
            case "int" : getInt(input); break;
            case "real" : getDouble(input); break;
            case "string" : getString(input); break;
            default:
                System.out.println("Error!"); break;
        }
    }
    public static void getInt(String input){
        int n = Integer.parseInt(input);
        System.out.println(2*n);
    }
    public static void getDouble(String input){
        double n = Double.parseDouble(input);
        System.out.printf("%.2f",n*1.5);
    }
    public static void getString(String input){
        String n = input;
        System.out.println("$"+n+"$");
    }
}
