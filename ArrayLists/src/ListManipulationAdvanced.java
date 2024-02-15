import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:

· Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
· Print even – print all the numbers that are even separated by a space
· Print odd – print all the numbers that are oddly separated by a space
· Get sum – print the sum of all the numbers
· Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
*/
public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String [] orders = command.split(" ");
            String order1 = orders[0];
            String order2 = orders[1];
            switch (order1){
                case "Contains" :
                    int order2value = Integer.valueOf(order2);
                    if (numbers.contains(order2value)){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print" :
                    if (order2.equals("even")){
                        for (int number : numbers){
                            if (number%2==0){
                                System.out.print(number+" ");
                            }
                        }
                    } else if (order2.equals("odd")){
                        for (int number : numbers){
                            if (number%2!=0){
                                System.out.print(number+" ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get" :
                    int total=0;
                    if (order2.equals("sum")){
                        for (int number : numbers){
                            total+=number;
                        }
                    }
                    System.out.println(total);
                    break;
                case "Filter" :
                    int order3 = Integer.valueOf(orders[2]);
                    if (order2.equals(">")){
                        for (int num : numbers){
                            if (num>order3){
                                System.out.print(num+" ");
                            }
                        }
                        System.out.println();
                    } else if (order2.equals("<")){
                        for (int num : numbers){
                            if (num<order3){
                                System.out.print(num+" ");
                            }
                        }
                        System.out.println();
                    } else if (order2.equals(">=")) {
                        for (int num : numbers){
                            if (num>=order3){
                                System.out.print(num+" ");
                            }
                        }
                        System.out.println();
                    } else if (order2.equals("<=")) {
                        for (int num : numbers){
                            if (num<=order3){
                                System.out.print(num+" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }


            command=scanner.nextLine();
        }
    }
}
