import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program that reads a list of integers from the console and receives commands which
manipulate the list. Your program may receive the following commands:

· Delete {element} - delete all elements in the array which are equal to the given element
· Insert {element} {position} - insert element at the given position

You should stop the program when you receive the command "end". Print all numbers in
the array, separated with a single whitespace
INPUT
1 2 3 4 5 5 5 6
Delete 5
Insert 10 1
Delete 5
end
OUTPUT
1 10 2 3 4 6

INPUT
20 12 4 319 21 31234 2 41 23 4
Insert 50 2
Insert 50 5
Delete 4
end
OUTPUT
20 12 50 319 50 21 31234 2 41 23
*/
public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String command1 = command.split(" ")[0];
            int command2 = Integer.parseInt(command.split(" ")[1]);
            switch (command1){
                case "Delete" :
                    numbers.removeAll(List.of(command2));
                    break;
                case "Insert" :
                    int command3 = Integer.parseInt(command.split(" ")[2]);
                    numbers.add(command3,command2);
                    break;
            }
            command=scanner.nextLine();
        }
        for (int num : numbers){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
