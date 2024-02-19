import java.util.Scanner;
/*
@CIHAN GUR

Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:

· 2.00 – 2.99 - "Fail"
· 3.00 – 3.49 - "Poor"
· 3.50 – 4.49 - "Good"
· 4.50 – 5.49 - "Very good"
· 5.50 – 6.00 - "Excellent"
*/
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        grade(Double.parseDouble(scanner.nextLine()));
    }

    public static void grade(double n){
        String result ="";
        if (n>=2.00 && n<=2.99) result="Fail";
        else if (n>=3.00 && n<=3.49) result="Poor";
        else if (n>=3.50 && n<=4.49) result="Good";
        else if (n>=4.50 && n<=5.49) result="Very good";
        else if (n>=5.50 && n<=6.00) result="Excellent";
        else result="Error!";
        System.out.println(result);
    }
}
