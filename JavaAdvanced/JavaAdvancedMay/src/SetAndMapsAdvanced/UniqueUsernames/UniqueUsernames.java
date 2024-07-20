package SetAndMapsAdvanced.UniqueUsernames;

import java.util.*;

/*
@CIHAN GUR

Write a simple program that reads a sequence of usernames from the console and keeps a collection with
only the unique ones. Print the collection on the console in order of insertion:

>>>>>INPUT
6
Hello
Hello
Hello
World
Hello
Greetings
>>>>>OUTPUT
Hello
World
Greetings

>>>>>INPUT
10
Peter
Maria
Peter
George
Stephen
Maria
Alexander
Peter
Stephen
George
>>>>>OUTPUT
Peter
Maria
George
Stephen
Alexander
*/
public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String input = scanner.nextLine();
            if (!usernames.contains(input)) {
                usernames.add(input);
            }
        }
        for (String username : usernames) {
            System.out.println(username);
        }

    }
}
