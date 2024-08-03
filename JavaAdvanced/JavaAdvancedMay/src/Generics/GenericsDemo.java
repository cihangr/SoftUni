package Generics;

public class GenericsDemo {
    public static void main(String[] args) {
        DisplayDemo<String> stringDisplay = new DisplayDemo<>();
        stringDisplay.display("Apple","Orange","Banana", "Peach");

        DisplayDemo<Integer> integerDisplay = new DisplayDemo<>();
        integerDisplay.display(1,2,3, 4);

        DisplayDemo<Double> doubleDisplay = new DisplayDemo<>();
        doubleDisplay.display(1.2,2.4,3.6, 4.8);

    }
}
