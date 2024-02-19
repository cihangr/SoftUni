import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f",calculate(first,operator,second));
    }
    public static double calculate(int a, String o, int b){
        double result=0;
        switch (o){
            case "+": result=a+b; break;
            case "-": result=a-b; break;
            case "/": result=(double)a/b; break;
            case "*": result=a*b; break;
        }

        return result;
    }
}
