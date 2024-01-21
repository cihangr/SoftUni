import java.util.Scanner;

/*
@CIHAN GUR

You will receive n lines. On those lines, you will receive one of the following:

· Opening bracket – "("
· Closing bracket – ")"
· Random string

Your task is to find out if the brackets are balanced. That means after every
 closing bracket should follow an opening one. Nested parentheses are not valid,
 and if two consecutive opening brackets exist, the expression should be marked
 as unbalanced.

Input

· On the first line, you will receive n – the number of lines that will follow.
· On the next n lines, you will receive "(", ")" or another string.

Output

You must print "BALANCED" if the parentheses are balanced and "UNBALANCED"
otherwise.

Constraints

· n will be in the interval [1…20].
· The length of the stings will be between [1…100] characters.

 */
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        boolean bracket=false;
        int counter=0;
        for (int i=0; i<n; i++){
            String command = inp.nextLine();
            if(counter>=0)
            {if (command.equals("(")){
                bracket=true;
                counter++;
            }
            if (command.equals(")")){
                bracket=false;
                if (counter<2) counter--;
            }}

        }
        if (bracket || counter!=0){
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }

    }
}
