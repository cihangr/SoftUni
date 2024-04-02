package FinalExamPrep;
/*
@CIHAN GUR

You are about to make some good money, but first, you need to think of a way to verify
who paid for your product and who didn't. You have decided to let people use the software
for a free trial period and then require an activation key to continue using the product.
Before you can cash out, the last step is to design a program that creates unique activation
keys for each user. So, waste no more time and start typing!
The first line of the input will be your raw activation key. It will consist of letters and numbers
only. After that, until the "Generate" command is given, you will be receiving strings with instructions
for different operations that need to be performed upon the raw activation key.
There are several types of instructions, split by ">>>":

"Contains>>>{substring}":
If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
Otherwise, prints: "Substring not found!"
"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
Changes the substring between the given indices (the end index is exclusive) to upper or lower case
and then prints the activation key.
All given indexes will be valid.
"Slice>>>{startIndex}>>>{endIndex}":
Deletes the characters between the start and end indices (the end index is exclusive) and prints
the activation key.
Both indices will be valid.

Input
The first line of the input will be a string consisting of letters and numbers only.
After the first line, until the "Generate" command is given, you will be receiving strings.
Output
After the "Generate" command is received, print:
"Your activation key is: {activation key}"

INPUT
abcdefghijklmnopqrstuvwxyz
Slice>>>2>>>6
Flip>>>Upper>>>3>>>14
Flip>>>Lower>>>5>>>7
Contains>>>def
Contains>>>deF
Generate
OUTPUT
abghijklmnopqrstuvwxyz
abgHIJKLMNOPQRstuvwxyz
abgHIjkLMNOPQRstuvwxyz
Substring not found!
Substring not found!
Your activation key is: abgHIjkLMNOPQRstuvwxyz

INPUT
134softsf5ftuni2020rockz42
Slice>>>3>>>7
Contains>>>-rock
Contains>>>-uni-
Contains>>>-rocks
Flip>>>Upper>>>2>>>8
Flip>>>Lower>>>5>>>11
Generate
OUTPUT
134sf5ftuni2020rockz42
Substring not found!
Substring not found!
Substring not found!
134SF5FTuni2020rockz42
134SF5ftuni2020rockz42
Your activation key is: 134SF5ftuni2020rockz42

*/
import java.util.Scanner;

public class ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals("Generate")){
            String command = input.split(">>>")[0];

            switch (command){
                case "Contains" :
                    String key = input.split(">>>")[1];
                    if (text.contains(key)){
                        System.out.printf("%s contains %s\n",text,key);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip" :
                    String upperOrLower = input.split(">>>")[1];
                    int startPosition = Integer.parseInt(input.split(">>>")[2]);
                    int endPosition = Integer.parseInt(input.split(">>>")[3]);
                    StringBuilder sb = new StringBuilder(text);
                    String changingPart = sb.substring(startPosition,endPosition);
                    if (upperOrLower.equals("Upper")) {
                        changingPart = changingPart.toUpperCase();
                    } else if (upperOrLower.equals("Lower")){
                        changingPart = changingPart.toLowerCase();
                    }
                    sb.replace(startPosition,endPosition,changingPart);
                    System.out.println(sb);
                    text=sb.toString();
                    break;
                case "Slice" :
                    int startSlice = Integer.parseInt(input.split(">>>")[1]);
                    int endSlice = Integer.parseInt(input.split(">>>")[2]);
                    StringBuilder sl = new StringBuilder(text);
                    sl.delete(startSlice,endSlice);
                    System.out.println(sl);
                    text=sl.toString();
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: "+text);
    }
}
