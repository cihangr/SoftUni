import java.util.Scanner;
/*
@CIHAN GUR

Read two names and a delimiter. Print the names joined by the delimiter.
 */
public class ConcatNames {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name1 = inp.nextLine();
        String name2 = inp.nextLine();
        String concat = inp.nextLine();
        System.out.println(name1+concat+name2);
    }
}
