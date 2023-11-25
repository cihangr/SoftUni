import java.util.Scanner;

public class animalType {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String animal = inp.nextLine();
        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
