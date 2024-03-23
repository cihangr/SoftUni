package AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
@CIHAN GUR

You are playing a game, and your goal is to win a legendary item - any legendary
item will be good enough. However, it's a tedious process and requires quite a bit
of farming. The possible items are:
"Shadowmourne" - requires 250 Shards
"Valanyr" - requires 250 Fragments
"Dragonwrath" - requires 250 Motes
"Shards", "Fragments", and "Motes" are the key materials 	(case-insensitive),
and everything else is junk.
You will be given lines of input in the format: 
"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
Keep track of the key materials - the first one that reaches 250, wins the race.
At that point, you have to print that the corresponding legendary item is obtained.
In the end, print the remaining shards, fragments, and motes in the format:
"shards: {numberOfShards}
fragments: {numberOfFragments}
motes: {numberOfMotes}"
Finally, print the collected junk items in the order of appearance.
Input
Each line comes in the following format:
"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
Output
On the first line, print the obtained item in the format: "{Legendary item} obtained!" .
On the next three lines, print the remaining key materials.
On the several final lines, print the junk items.
All materials should be printed in the format: "{material}: {quantity}".
The output should be lowercase, except for the first letter of the legendary.

INPUT
3 Motes 5 stones 5 Shards
6 leathers 255 fragments 7 Shards
OUTPUT
Valanyr obtained!
shards: 5
fragments: 5
motes: 3
stones: 5
leathers: 6

INPUT
123 silver 6 shards 8 shards 5 motes
9 fangs 75 motes 103 MOTES 8 Shards
86 Motes 7 stones 19 silver
OUTPUT
Dragonwrath obtained!
shards: 22
fragments: 0
motes: 19
silver: 123
fangs: 9

*/
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();

        boolean isLegendaryItemBought = false;

        while (!isLegendaryItemBought) {

            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int index = 0; index <= inputData.length - 1; index += 2) {

                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int existingQuantity = materials.get(material);
                    materials.put(material, existingQuantity + quantity);
                } else {
                    if (junks.containsKey(material)) {
                        int existingQuantity = junks.get(material);
                        junks.put(material, existingQuantity + quantity);
                    } else {
                        junks.put(material, quantity);
                    }
                }
                for (Map.Entry<String, Integer> entry : materials.entrySet()) {

                    if (entry.getValue() >= 250) {
                        isLegendaryItemBought = true;
                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        int newQuantity = entry.getValue() - 250;
                        materials.put(material, newQuantity);
                    }
                }

                if (isLegendaryItemBought) {
                    break;
                }
            }
        }

        materials.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
        junks.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}