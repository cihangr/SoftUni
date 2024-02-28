package DataTypesAndVariables;

import java.util.Scanner;

/*
@CIHAN GUR

Write a program to read an integer n and print all triples of the first
n small Latin letters, ordered alphabetically:
HINTS
Perform 3 nested loops from 0 to n-1.
Input
3
Output
aaa
aab
aac...
 */
public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i=0; i<n; i++){
            char firstChar = (char)('a'+i);
            for (int j=0; j<n; j++){
                char secondChar = (char)('a'+j);
                for (int k=0; k<n; k++){
                    char thirdChar = (char)('a'+k);
                    System.out.printf("%c%c%c\n",firstChar,secondChar,thirdChar);
                }
            }
        }
    }
}
