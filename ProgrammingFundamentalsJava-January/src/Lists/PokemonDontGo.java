import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
@CIHAN GUR

Ely likes to play Pokémon Go a lot. But Pokémon Go went bankrupt…
So, the developers made Pokémon Don't Go out of depression. And so,
Ely now plays Pokémon Don't Go. In Pokémon Don't Go, when you walk to a certain Pokémon,
those closest to you naturally get further, and those further from you get closer.
You will receive a sequence of integers, separated by spaces - the distances to the Pokémons.
Then you will begin receiving integers corresponding to indexes in that sequence.
When you receive an index, you must remove the element at that index from the sequence
(as if you've captured the Pokémon).

>>>You must INCREASE the value of all elements in the sequence which are LESS or EQUAL
 to the removed element with the value of the removed element.

>>>You must DECREASE the value of all elements in the sequence which are GREATER than
the removed element with the value of the removed element.

>>>If the given index is LESS than 0, remove the first element of the sequence, and COPY
the last element to its place.

>>>If the given index is GREATER than the last index of the sequence, remove the last
element from the sequence, and COPY the first element to its place.

>>>The increasing and decreasing of elements should be done in these cases, also.

>>>The element whose value you should use is the REMOVED element.

>>>The program ends when the sequence has no elements (there are no Pokémons left for Ely to catch).

Input
· On the first line of input, you will receive a sequence of integers, separated by spaces.
· On the next several lines, you will receive integers – the indexes.

Output
· When the program ends, you must print the summed up value of all REMOVED elements on the console.

Constraints
· The input data will consist ONLY of valid integers in the range [-2.147.483.648, 2.147.483.647

INPUT
4 5 3
1
1
0
OUTPUT
14

INPUT
5 10 6 3
5
2
4
1
1
3
0
0
OUTPUT
51
*/
public class PokemonDontGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int removedElement = numbers.get(0);
                sum += removedElement;
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.set(0, lastElement);
                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1) {
                int removedElement = numbers.get(numbers.size() - 1);
                sum += removedElement;
                int firstElement = numbers.get(0);
                numbers.set(numbers.size() - 1, firstElement);
                modifyList(numbers, removedElement);
            }
        }

        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {

        for (int position = 0; position <= numbers.size() - 1; position++) {

            int currentElement = numbers.get(position);

            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }

            numbers.set(position, currentElement);
        }
    }

}