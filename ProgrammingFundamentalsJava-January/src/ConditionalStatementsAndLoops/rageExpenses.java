import java.util.Scanner;

/*
@CIHAN GUR

Rage Expenses

As a MOBA challenger player, Peter has the bad habit of trashing
his PC when he loses a game and rage quits. His gaming setup
consists of a headset, mouse, keyboard, and display. You will
receive Peter's lost games count.

Every second lost game, Peter trashes his headset.

Every third lost game, Peter trashes his mouse.

When Peter trashes both his mouse and headset in the same lost
game, he also trashes his keyboard.

Every second time when he trashes his keyboard, he also trashes
his display.

You will receive the price of each item in his gaming setup.
Calculate his rage expenses for renewing his gaming equipment.

Input / Constraints

On the first input line - lost games count – integer in the range [0, 1000].
On the second line – headset price - the floating-point number in the range [0, 1000].
On the third line – mouse price - the floating-point number in the range [0, 1000].
On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
On the fifth line – display price - the floating-point number in the range [0, 1000].

Output

As output you must print Peter's total expenses: "Rage expenses: {expenses} lv."
Allowed working time / memory: 100ms / 16MB.

 */
public class rageExpenses {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int lostGames = Integer.parseInt(inp.nextLine());
        double headset = Double.parseDouble(inp.nextLine());
        double mouse = Double.parseDouble(inp.nextLine());
        double keyboard = Double.parseDouble(inp.nextLine());
        double display = Double.parseDouble(inp.nextLine());
        int countheadset=0,countmouse=0,countkeyboard=0,countdisplay=0;
        double totalPrice;
        for (int i=1; i<=lostGames; i++){
            if (i%2==0) countheadset++;
            if (i%3==0) countmouse++;
            if (i%6==0) {
                countkeyboard++;
                if (countkeyboard>1 && countkeyboard%2==0) countdisplay++;
            }
        }
        totalPrice=(headset*countheadset)+(mouse*countmouse)+(keyboard*countkeyboard)+(display*countdisplay);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
