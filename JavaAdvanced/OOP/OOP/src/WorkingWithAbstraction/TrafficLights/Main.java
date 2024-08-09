package WorkingWithAbstraction.TrafficLights;
/*
@CIHAN GUR

Implement a simple state machine in the form of a traffic light. Every traffic light has three possible signals - red,
 green, and yellow. Each traffic light can be updated, which changes the color of its signal (e.g. if it is currently
  red, it changes to green, if it is green it changes to yellow). The order of signals is red -> green ->
  yellow -> red and so on.
On the first line, you will be given multiple traffic light signals in the format "RED GREEN YELLOW". They may
be 3, more, or less than 3. You need to make as many traffic lights as there are signals in the input.
On the second line, you will receive the n number of times you need to change each traffic light's signal.
Your output should consist of n number of lines, including each updated traffic light's signal. To better understand
 the problem, see the example below.


>>>>>INPUT
GREEN RED YELLOW
4
>>>>>OUTPUT
YELLOW GREEN RED
RED YELLOW GREEN
GREEN RED YELLOW
YELLOW GREEN RED

>>>>>INPUT
RED RED RED GREEN GREEN GREEN
6
>>>>>OUTPUT
GREEN GREEN GREEN YELLOW YELLOW YELLOW
YELLOW YELLOW YELLOW RED RED RED
RED RED RED GREEN GREEN GREEN
GREEN GREEN GREEN YELLOW YELLOW YELLOW
YELLOW YELLOW YELLOW RED RED RED
RED RED RED GREEN GREEN GREEN
*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lights[] lights = Arrays.stream(scanner.nextLine().split("\\s+")).map(light -> Lights.valueOf(light)).toArray(Lights[]::new);

        int updates = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < updates; i++) {
            updateLights(lights);
            printLights(lights);
        }
    }

    private static void updateLights(Lights[] lights) {
        for (int i = 0; i < lights.length; i++) {
            switch (lights[i]) {
                case RED -> lights[i] = Lights.GREEN;
                case GREEN -> lights[i] = Lights.YELLOW;
                case YELLOW -> lights[i] = Lights.RED;
            }
        }
    }
    private static void printLights(Lights[] lights) {
        for (Lights light : lights) {
            System.out.print(light+" ");
        }
        System.out.println();
    }
}
