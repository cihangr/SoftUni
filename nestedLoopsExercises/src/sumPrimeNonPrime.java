import java.util.Scanner;

public class sumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean primeCheck=true;
        String stopper = scanner.nextLine();
        int sumPrime = 0, sumNonPrime = 0;
        while (!stopper.equals("stop")){
            int num = Integer.parseInt(stopper);
            if (num<0){
                System.out.println("Number is negative.");
                break;
            }
            if (num==2 || num==1){
                primeCheck=true;
            }
            if (num>2) {
            for (int i=2; i<=num/2; ++i){
                if (num%i!=0) {
                    primeCheck=true;
                } else {
                    primeCheck=false;
                }
                break;
            } }
            if (primeCheck){
                    System.out.println(num+ "is prime");
                sumPrime+=num;
            } else {
                    System.out.println(num+ "is not prime");
                sumNonPrime+=num;
            }


            stopper = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: "+sumPrime);
        System.out.println("Sum of all non prime numbers is: "+sumNonPrime);
    }
}
