package Generics.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Swap<T> {

    private List<T> values;

    public Swap() {
        this.values = new ArrayList<>();
    }

    public void add(T value) {
        this.values.add(value);
    }

    public void swap(int index1, int index2) {
        T firstValue = values.get(index1);
        T secondValues = values.get(index2);

        this.values.set(index1, secondValues);
        this.values.set(index2, firstValue);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            String formattedValue = String.format("%s: %s", value.getClass().getName(), value);
            sb.append(formattedValue).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
