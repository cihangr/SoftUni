import java.util.Scanner;

/*
@CIHAN GUR

You will receive a key (integer) and n characters afterward. Add the key to each character
and append them to the message. In the end, print the message, which you decrypted.

Input

· On the first line, you will receive the key.
· On the second line, you will receive n – the number of lines that will follow.
· On the next n lines – you will receive lower and uppercase characters from the Latin alphabet.

Output

Print the decrypted message.
 */
public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int key = Integer.parseInt(inp.nextLine());
        int n = Integer.parseInt(inp.nextLine());
        StringBuilder decrypted = new StringBuilder();
        for (int i=0; i<n; i++){
            char c = inp.nextLine().charAt(0);
            int a= c;
            decrypted.append((char) (a + key));
        }
        System.out.println(decrypted);

    }
}
