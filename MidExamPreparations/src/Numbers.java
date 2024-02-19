import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You are given numbers in a sequence on a single line, separated by a space.
After that, you will receive commands that modify the sequence differently:
"Add {value}" - you should add the given value to the end of the sequence.
"Remove {value}" - you should remove the first occurrence of the given
value if there is such.
"Replace {value} {replacement}" - you should replace the first occurrence
of the given value with the replacement if there is such occurrence.
"Collapse {value}" you must remove each number with a value less than
the given one.
When you receive the command "Finish", you should print the modified
sequence and end the program.
Input / Constraints
On the first line, you will receive a sequence with numbers, separated by spaces - integers in the range
[-1000…1000].
On the following lines, you will receive commands until the "Finish" command is received.
The commands will always be valid.
Output
Print a single line the array of numbers separated by a space, with the modified values.
INPUT
1 4 5 19
Add 1
Remove 4
Finish
OUTPUT
1 5 19 1

INPUT
1 20 -1 10
Collapse 8
Finish
OUTPUT
20 10

INPUT
5 9 70 -56 9 9
Replace 9 10
Remove 9
Finish
OUTPUT
5 10 70 -56 9
*/
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("Finish")){
            String operator = command.split(" ")[0];
            int value = Integer.parseInt(command.split(" ")[1]);
            if(operator.equals("Add")) {
                numbers.add(value);
            } else if(operator.equals("Remove")) {
                for (int position = 0; position < numbers.size(); position++) {
                    if (numbers.get(position) == value) {
                        numbers.remove(position);
                        break;
                    }
                }
            } else if(operator.equals("Replace")) {
                int replacement = Integer.parseInt(command.split(" ")[2]);
                int indexOfValue = numbers.indexOf(value);
                numbers.remove(Integer.valueOf(value));
                numbers.add(indexOfValue, replacement);
            } else if(operator.equals("Collapse")) {
                numbers.removeIf(num -> num < value);
            }


            command = scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number+" ");
        }
    }
}
