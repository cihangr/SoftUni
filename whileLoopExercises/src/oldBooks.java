import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        String library = "";
        int n=0;
        while (!name.equals(library)){
            if (library.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",n-1);
                return;
            }
            library = inp.nextLine();
            n++;
        }
        System.out.printf("You checked %d books and found it.",n-1);
    }
}
