
package WorkingWithAbstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long goldNumber = 0;
        long gemNumber = 0;
        long cashNumber = 0;

        for (int itemNumber = 0; itemNumber < items.length; itemNumber += 2) {
            String name = items[itemNumber];
            long numberOfItem = Long.parseLong(items[itemNumber + 1]);
            String nameOfItem = smallLettersOfItem(name);

            if (nameOfItemCondition(nameOfItem, bagCapacity, bag, numberOfItem)) continue;
            if (itemTypeCondition(nameOfItem, bag, numberOfItem)) continue;
            addToBag(bag, nameOfItem, name);

            bag.get(nameOfItem).put(name, bag.get(nameOfItem).get(name) + numberOfItem);
            if (nameOfItem.equals("Gold")) {
                goldNumber += numberOfItem;
            } else if (nameOfItem.equals("Gem")) {
                gemNumber += numberOfItem;
            } else if (nameOfItem.equals("Cash")) {
                cashNumber += numberOfItem;
            }
        }

        print(bag);
    }

    private static void print(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        for (var item : bag.entrySet()) {
            Long sumValues = item.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", item.getKey(), sumValues));

            item.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static void addToBag(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, String nameOfItem, String name) {
        if (!bag.containsKey(nameOfItem)) {
            bag.put(nameOfItem, new LinkedHashMap<String, Long>());
        }

        if (!bag.get(nameOfItem).containsKey(name)) {
            bag.get(nameOfItem).put(name, 0L);
        }
    }

    private static boolean nameOfItemCondition(String nameOfItem, long bagCapacity, LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long numberOfItem) {
        if (nameOfItem.isEmpty()) {
            return true;
        } else if (bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + numberOfItem) {
            return true;
        }
        return false;
    }

    private static boolean itemTypeCondition(String nameOfItem, LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long numberOfItem) {
        switch (nameOfItem) {
            case "Gem":
                if (!bag.containsKey(nameOfItem)) {
                    if (bag.containsKey("Gold")) {
                        if (numberOfItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(nameOfItem).values().stream().mapToLong(e -> e).sum() + numberOfItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
            case "Cash":
                if (!bag.containsKey(nameOfItem)) {
                    if (bag.containsKey("Gem")) {
                        if (numberOfItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else if (bag.get(nameOfItem).values().stream().mapToLong(e -> e).sum() + numberOfItem > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                    return true;
                }
                break;
        }
        return false;
    }

    private static String smallLettersOfItem(String name) {
        String nameOfItem = "";

        if (name.length() == 3) {
            nameOfItem = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            nameOfItem = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            nameOfItem = "Gold";
        }
        return nameOfItem;
    }
}