package Methods;

import java.util.Locale;
import java.util.Scanner;

/*
@CIHAN GUR

Write a method that receives a single string and prints the count of the vowels.
Use an appropriate name for the method.

 */
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(countVowels(S));
    }
    public static int countVowels(String s){
        int result=0;
        s=s.toLowerCase();
        char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == s.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }
}
