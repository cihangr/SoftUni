import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String stopper = inp.nextLine();
        int max= Integer.MIN_VALUE;
        while (!stopper.equals("Stop")){
            int entered = Integer.parseInt(stopper);
            if (entered>max){
                max=entered;
            }
            stopper = inp.nextLine();
        }
            System.out.println(max);
    }
}
