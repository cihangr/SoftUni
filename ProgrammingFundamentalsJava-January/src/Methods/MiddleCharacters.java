import java.util.Scanner;

/*
@CIHAN GUR

You will receive a single string. Write a method that prints the middle character.
If the length of the string is even, there are two middle characters.
 */
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(mid(s1));;
    }
    public static StringBuilder mid(String s){
        int i;
        StringBuilder s1 = new StringBuilder();
        if (s.length()%2!=0){
            i=(s.length()-1)/2;
            s1.append(s.charAt(i));
            return s1;
        } else {
            i=s.length()/2;
            s1.append(s.charAt(i-1));
            s1.append(s.charAt(i));
            return s1;
        }
    }
}
