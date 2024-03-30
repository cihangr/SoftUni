package RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
@CIHAN GUR

The war is at its peak, but you, young Padawan, can turn the tides with your programming skills.
You are tasked to create a program to decrypt the messages of The Order and prevent the death
of hundreds of lives.
You will receive several messages, which are encrypted using the legendary star enigma.
You should decrypt the messages following these rules:
To properly decrypt a message, you should count all the letters [s, t, a, r] – case insensitive
and remove the count from the current ASCII value of each symbol of the encrypted message.
After decryption:
Each message should have a planet name, population, attack type ('A', as an attack or 'D',
as destruction), and soldier count.
The planet's name starts after '@' and contains only letters from the Latin alphabet.
The planet population starts after ':' and is an Integer;
The attack type may be "A"(attack) or "D"(destruction) and must be surrounded by "!"
(Exclamation mark).
The soldier count starts after "->" and should be an Integer.
The order in the message should be: planet name -> planet population -> attack type ->
soldier count. Each part can be separated from the others by any character except:
'@', '-', '!', ':' and '>'.
Input / Constraints
The first line holds n – the number of messages – integer in the range [1…100].
On the next n lines, you will be receiving encrypted messages.
Output
After decrypting all messages, you should print the decrypted information
in the following format:
First print the attacked planets, then the destroyed planets."Attacked planets:
{attackedPlanetsCount}" "-> {planetName}" "Destroyed planets: {destroyedPlanetsCount}" "-> {planetName}"
The planets should be ordered by name alphabetically.

INPUT
2
STCDoghudd4=63333$D$0A53333
EHfsytsnhf?8555&I&2C9555SR
OUTPUT
"Attacked planets: 1
-> Alderaa
Destroyed planets: 1
-> Cantonica

INPUT
3
tt(''DGsvywgerx>6444444444%H%1B9444
GQhrr|A977777(H(TTTT
EHfsytsnhf?8555&I&2C9555SR
OUTPUT
Attacked planets: 0
Destroyed planets: 2
-> Cantonica
-> Coruscant

*/
public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int messageCount = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 0; i < messageCount; i++) {
            String secretMessage = scanner.nextLine();
            String decryptedMessage = decryptetion(secretMessage);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()){
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                if (attackType.equals("A")){
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")){
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        Collections.sort(attackedPlanets); //сортирам планетите по име
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets); //сортирам планетите по име
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));


    }

    private static String decryptetion(String encryptedMessage) {
        int countLetters = getSpecialLettersCount(encryptedMessage);
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol  : encryptedMessage.toCharArray()) {
            char newSymbol = (char)(symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }
    private static int getSpecialLettersCount(String encryptedMessage) {
        int count = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}
