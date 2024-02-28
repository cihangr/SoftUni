package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int w = Integer.parseInt(inp.nextLine());
        int l = Integer.parseInt(inp.nextLine());
        int h = Integer.parseInt(inp.nextLine());
        int area = w*l*h;
        int currentSpace = 0;
        String stopper = inp.nextLine();
        while (!stopper.equals("Done")){
            int boxes = Integer.parseInt(stopper);
            currentSpace += boxes;
            if (currentSpace>=area){
                break;
            }
            stopper=inp.nextLine();
        }
        if (currentSpace>=area){
            System.out.printf("No more free space! You need %d Cubic meters more.",currentSpace-area);
        } else {
        System.out.printf("%d Cubic meters left.",area-currentSpace);
        }
    }
}
