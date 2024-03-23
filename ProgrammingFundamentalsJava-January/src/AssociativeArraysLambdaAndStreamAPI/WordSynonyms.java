package AssociativeArraysLambdaAndStreamAPI;
/*
@CIHAN GUR

Write a program that keeps a map with synonyms. The key to the map will be the word.
The value will be a list of all the synonyms of that word. You will be given a number
n. On the next 2 * n lines, you will be given the word and a synonym each on a
separate line like this:

· {word}
· {synonym}

If you get the same word for the second time, just add the new synonym to the list.
Print the words in the following format:
{word} - {synonym1, synonym2… synonymN}

INPUT
3
cute
adorable
cute
charming
smart
clever
OUTPUT
cute - adorable, charming
smart - clever

INPUT
2
task
problem
task
assignment
OUTPUT
task – problem, assignment

*/
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> SysnonymsMap = new LinkedHashMap<>();

        while (n>0){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
//            if (!SysnonymsMap.containsKey(word)){
//                SysnonymsMap.put(word,new ArrayList<>());
//                SysnonymsMap.get(word).add(synonym);
//            } else {
//                SysnonymsMap.get(word).add(synonym);
//            }
            //1. думата да не сме я срещали
            SysnonymsMap.putIfAbsent(word, new ArrayList<>());
            //думата я има
            SysnonymsMap.get(word).add(synonym);

            n--;
        }
        for(Map.Entry<String,List<String>> pair : SysnonymsMap.entrySet()){
            String word = pair.getKey();
            List<String> synonym = pair.getValue();
            System.out.println(word+" - "+String.join(", ",synonym));
        }
    }
}
