package Generics.GenericCountMethodString;


import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Comparable<T>> {

    private List<T> values;

        public Counter(){
            this.values = new ArrayList<>();
        }
        public void add(T element){
            this.values.add(element);
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (T element : this.values){
                String formattedValue = String.format("%s: %s", element.getClass().getName(), element);
                sb.append(formattedValue).append(System.lineSeparator());
            }
            return sb.toString();
        }
        public int countGreaterValues(T valueToCompare){
            int count = 0;
            for (T element : this.values){
                int compare = element.compareTo(valueToCompare);
                if(compare > 0){
                    count++;
                }
            }
            return count;
        }
}
