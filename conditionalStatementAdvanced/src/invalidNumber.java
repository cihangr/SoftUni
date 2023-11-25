import java.util.Scanner;

public class invalidNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = Integer.parseInt(inp.nextLine());
        if (num>=100 && num<=200 || num==0){
            System.out.println(" ");
        } else {
            System.out.println("invalid");
        }
    }
}
