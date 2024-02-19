import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = Integer.parseInt(inp.nextLine());
        if (a % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
