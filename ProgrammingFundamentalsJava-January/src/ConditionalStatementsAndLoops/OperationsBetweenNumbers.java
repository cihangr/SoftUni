import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1 = Integer.parseInt(inp.nextLine());
        int n2 = Integer.parseInt(inp.nextLine());
        String operator = inp.nextLine();
        if (n2==0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero",n1);
            return;
        }
        double result=0;
        switch (operator){
            case "+": result=n1+n2; break;
            case "-": result=n1-n2; break;
            case "*": result=n1*n2; break;
            case "/": result=n1*1.0 /n2; break;
            case "%": result=n1%n2; break;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if ((result % 2) == 0) {
                System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
            } else if ((result % 2) != 0) {
                System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
            }
        } else if (operator.equals("/")){
                System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
        } else if (operator.equals("%")) {
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
        }
    }
}
