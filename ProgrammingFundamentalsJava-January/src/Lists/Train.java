import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

On the first line, you will be given a list of wagons (integers). Each integer represents the
number of passengers that are currently in each wagon. On the next line, you will get the max
capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:

· Add {passengers} - add a wagon to the end with the given number of passengers
· {passengers} - find an existing wagon to fit all the passengers (starting from the first wagon)

In the end, print the final state of the train (all the wagons separated by a space)
INPUT
32 54 21 12 4 0 23
75
Add 10
Add 0
30
10
75
end
OUTPUT
72 54 21 12 4 75 23 10 0
*/
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> Vagons = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        String passengers = scanner.nextLine();
        while (!passengers.equals("end")){
            if (passengers.contains("Add")){
                int numberOfPassendgers = Integer.parseInt(passengers.split(" ")[1]);
                    Vagons.add(numberOfPassendgers);
            } else {
                int numberOfPassengers = Integer.parseInt(passengers);
                for (int index = 0; index <= Vagons.size() - 1; index++) {
                    int existingPassengers = Vagons.get(index);
                    if (existingPassengers+numberOfPassengers<=capacity){
                        Vagons.set(index,existingPassengers+numberOfPassengers);
                        break;
                    }
                }
            }

            passengers=scanner.nextLine();
        }
        for (int vagon : Vagons){
            System.out.print(vagon+" ");
        }
        System.out.println();
    }
}
