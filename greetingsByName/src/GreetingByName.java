import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
