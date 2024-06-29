package SetAndMapsAdvanced.SoftUniParty;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
@CIHAN GUR

There is a party in SoftUni. Many guests are invited, and they are two types: VIP and regular.
When a guest comes, you have to check if he/she exists on any of the two reservation lists.
All reservation numbers will be with 8 chars. All VIP numbers start with a digit.
There will be 2 command lines:
First is "PARTY" - the party is on, and guests are coming.
The second is "END" - then the party is over, and no more guests will come.
The output shows all guests who didn't come to the party (VIP must be first).

>>>>>>>>>>>>INPUT
7IK9Yo0h
9NoBUajQ
Ce8vwPmE
SVQXQCbc
tSzE5t0p
PARTY
9NoBUajQ
Ce8vwPmE
SVQXQCbc
END
>>>>>>>>>>>>OUTPUT
2
7IK9Yo0h
tSzE5t0p

>>>>>>>>>>>>INPUT
m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
xys2FYzn
MDzcM9ZK
PARTY
2FQZT3uC
dziNz78I
mdSGyQCJ
LjcVpmDL
fPXNHpm1
HTTbwRmM
B5yTkMQi
8N0FThqG
m8rfQBvl
fc1oZCE0
UgffRkOn
7ugX7bm0
9CQBGUeJ
END
>>>>>>>>>>>>OUTPUT
2
MDzcM9ZK
xys2FYzn
*/
public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> VIP = new TreeSet<>();
        Set<String> REGULAR = new TreeSet<>();

        String guestID = scanner.nextLine();
        while(!guestID.equals("PARTY")){
            if (Character.isDigit(guestID.charAt(0))) {
                VIP.add(guestID);
            } else {
                REGULAR.add(guestID);
            }
            guestID = scanner.nextLine();
        }
        String finish = scanner.nextLine();
        while(!finish.equals("END")){
            if(Character.isDigit(finish.charAt(0))) {
                VIP.remove(finish);
            } else {
                REGULAR.remove(finish);
            }
            finish = scanner.nextLine();
        }
        int size = VIP.size()+REGULAR.size();
        System.out.println(size);
        VIP.forEach(System.out::println);
        REGULAR.forEach(System.out::println);


    }
}
