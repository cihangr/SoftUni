package SetAndMapsAdvanced;

import java.util.*;

public class SetsAndMapsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        ▪ A set keeps UNIQUE elements
        ▪ Provides methods for adding/removing/searching elements
        ▪ Offers very FAST performance
         */

        Set<String> set = new LinkedHashSet<>();  //Creating a hashset. hashset adds randomly.
        Set<String> tree = new TreeSet<>(); // for reading easier. Elements are ordered incrementally.
        Set<String> linkedHashSet = new LinkedHashSet<>(); // the order of the appearance is preserved.

        System.out.println(set.size()); // 0 - giving the size of the set
        System.out.println(tree.isEmpty()); // true - checking is it empty

        // hashset is making collisions. therefore is not good to use so much.

        /*Associative arrays are arrays indexed by keys
        Hold a set of pairs <key, value>


        HashMap<K, V>, TreeMap<K, V>, LinkedHashMap<K, V>
        size()- the number of key-value pairs
        ▪ keySet()- a set of unique keys
        ▪ values()- a collection of all values
        ▪ Basic operations - put(), remove(), clear()
        ▪ Boolean methods:
        ▪ containsKey()- checks if a key is present in the Map
        ▪ containsValue()- checks if a value is present in the Map


        */

        Map<String, Integer> hash = new HashMap<>();
        System.out.println(hash.size()); // 0
        System.out.println(hash.isEmpty()); // True

        hash.put("A",13);
        hash.put("B",26);
        hash.put("C",39);
        hash.put("D",52);

        for (Map.Entry<String, Integer> entry : hash.entrySet()) { //Map.Entry<String, Integer> was before var. if no need entrykey, we can make normal foreach.
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        /* Output here.
        Key: A Value: 13
        Key: B Value: 26
        Key: C Value: 39
        Key: D Value: 52
         */
    }
}
