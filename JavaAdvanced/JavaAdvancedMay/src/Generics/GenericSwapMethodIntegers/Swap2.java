package Generics.GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;

public class Swap2<T> {
    private List<T> list;
    public Swap2(){
        this.list = new ArrayList<>();
    }
    public void add(T element){
        this.list.add(element);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T element : this.list){
            String formattedValue = String.format("%s: %s", element.getClass().getName(), element);
            sb.append(formattedValue).append(System.lineSeparator());
        }
        return sb.toString();
    }
    public void swp(int index1, int index2) {
        T firstValue = list.get(index1);
        T secondValues = list.get(index2);

        this.list.set(index1, secondValues);
        this.list.set(index2, firstValue);
    }

    public static <T> void checkbox(Swap2<?> swapAnything){
        System.out.println(swapAnything.toString());
    }
}
