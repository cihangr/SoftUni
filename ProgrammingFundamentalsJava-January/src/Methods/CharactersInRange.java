import java.util.Scanner;

/*
@CIHAN GUR

Write a method that receives two characters and prints all the characters in between
them on a single line according to ASCII.
 */
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char C1 = scanner.nextLine().charAt(0);
        char C2 = scanner.nextLine().charAt(0);
        getRange(C1,C2);
    }
    public static void getRange(char c1, char c2){
        if (c1>c2){
            for (int i = c2+1; i < c1; i++) {
                System.out.print((char)i+" ");
            }
        } else {
            for (int i = c1+1; i < c2; i++) {
                System.out.print((char)i+" ");
            }
        }
    }
}
