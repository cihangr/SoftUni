import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You are going to receive two lists with numbers. Create a result list that contains
the numbers from both of the lists. The first element should be from the first list,
the second from the second list, and so on. If the length of the two lists is not
equal, just add the remaining elements at the end of the list.
INPUT
3 5 2 43 12 3 54 10 23
76 5 34 2 4 12
OUTPUT
3 76 5 5 2 34 43 2 12 4 3 12 54 10 23

INPUT
76 5 34 2 4 12
3 5 2 43 12 3 54 10 23
OUTPUT

*/
public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt).collect(Collectors.toList());
        int ListPosition=0;
        if (secondList.size()<=firstList.size()) {
            for (int position = 1; position < 2 * secondList.size(); position++) {
                firstList.add(position, secondList.get(ListPosition));
                position++;
                ListPosition++;
            }
            for (int number : firstList){
                System.out.print(number+" ");
            }
        } else {
            for (int position = 0; position < 2 * firstList.size(); position++) {
                secondList.add(position, firstList.get(ListPosition));
                position++;
                ListPosition++;
            }
            for (int number : secondList){
                System.out.print(number+" ");
            }
        }
    }
}
