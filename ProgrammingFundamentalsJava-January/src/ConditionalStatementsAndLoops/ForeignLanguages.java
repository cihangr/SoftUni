package ConditionalStatementsAndLoops;

import java.util.Scanner;

/*
@cihangr

Write a program that:
Reads a string from the console, representing country
Print:
"English" -> if the entered country is "USA" or "England"
"Spanish" -> if the entered country is "Spain" or "Argentina" or "Mexico"
"unknown" -> if the entered country is any other different from countries listed above

 */
public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String country = inp.nextLine();
        if (country.equals("USA") || country.equals("England")){
            System.out.println("English");
        } else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
