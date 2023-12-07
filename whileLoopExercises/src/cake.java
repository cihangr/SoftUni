import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = Integer.parseInt(inp.nextLine());
        int b = Integer.parseInt(inp.nextLine());
        int pieces = a*b;
        String stopper = inp.nextLine();
        while (!stopper.equals("STOP")){
            int takePiece = Integer.parseInt(stopper);
            pieces-=takePiece;
            if (pieces<=0){
                System.out.printf("No more cake left! You need %d pieces more. ",Math.abs(pieces));
                return;
            }
            stopper = inp.nextLine();
        }
        System.out.printf("%d pieces are left.",pieces);

    }
}
