import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        int projectNum = inp.nextInt();
        System.out.println("The architect "+name+" will need "+(projectNum*3)+" hours to complete "+projectNum+" project/s.");
    }
}