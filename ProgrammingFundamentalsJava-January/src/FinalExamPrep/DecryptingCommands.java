package FinalExamPrep;
/*
@CIHAN GUR

On the first line, you are going to receive a string. You will receive "decrypting" commands
on the following lines until you get the "Finish" command. There are five possible commands:
"Replace {currentChar} {newChar}"
Replace all occurrences of the current char with the new char, then print the resulting message.
"Cut {startIndex} {endIndex}"
Remove the substring from the start index until the end index (both inclusive), then print
the resulting message.
If any of the indexes is not valid, print:  "Invalid indices!".
"Make {Upper/Lower}"
Replace all letters with upper/lower case and print the resulting message.
"Check {string}"
If the message contains the given string, print: "Message contains {string}".
Otherwise, print: "Message doesn't contain {string}".
"Sum {startIndex} {endIndex}"
Get the substring from the start index to the end index (both inclusive) and print the sum
of the ASCII values of the substring.
If any of the given indices are invalid, print: "Invalid indices!". An index is valid when
it is non-negative and less than the size of the collection.
Note: At any time, the message will contain at least one character.
Input
On the first line, you are going to receive the string.
On the following lines, until the "Finish" command is received, you will be receiving commands.
Output
Print the output of every command in the format described above.
Constraints
The indexes will be integers in the range [-50…150].

INPUT
ILikeSoftUni
Replace I We
Make Upper
Check SoftUni
Sum 1 4
Cut 1 4
Finish
OUTPUT
WeLikeSoftUni
WELIKESOFTUNI
Message doesn't contain SoftUni
293
WESOFTUNI

INPUT
HappyNameDay
Replace p r
Make Lower
Cut 2 23
Sum -2 2
Finish
OUTPUT
HarryNameDay
harrynameday
Invalid indices!
Invalid indices!

*/

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String command = scanner.nextLine();
        while(!command.equals("Finish")){
            String modify = command.split(" ")[0];
            switch(modify){
                case "Replace" : //"Replace {currentChar} {newChar}"
                    String temporaryString = sb.toString();
                    String forRemove = command.split(" ")[1];
                    String forReplace = command.split(" ")[2];
                    temporaryString=temporaryString.replaceAll(forRemove,forReplace);
                    sb = new StringBuilder(temporaryString);
                    System.out.println(sb);
                break;
                case "Cut" : //"Cut {startIndex} {endIndex}"
                    int startIndexCut = Integer.parseInt(command.split(" ")[1]);
                    int endIndexCut = Integer.parseInt(command.split(" ")[2]);
                    if (startIndexCut>=0 && endIndexCut<=sb.length()){
                        sb.delete(startIndexCut,endIndexCut+1);
                        System.out.println(sb);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                break;
                case "Make" : //"Make {Upper/Lower}"
                    String upOrLow = command.split(" ")[1];
                    String newString = "";
                    if (upOrLow.equals("Upper")) {
                        newString = sb.toString().toUpperCase();
                    } else if (upOrLow.equals("Lower")) {
                        newString = sb.toString().toLowerCase();
                    }
                    sb= new StringBuilder(newString);
                    System.out.println(sb);
                    break;
                case "Check" : //"Check {string}"
                    String key = command.split(" ")[1];
                    String tempString = sb.toString();
                    if (tempString.contains(key)){
                        //"Message contains {string}"
                        System.out.println("Message contains "+key);
                    } else {
                        //"Message doesn't contain {string}"
                        System.out.println("Message doesn't contain "+key);
                    }
                    sb= new StringBuilder(tempString);
                break;
                case "Sum" : //"Sum {startIndex} {endIndex}" inclusive both
                    int startIndexSum = Integer.parseInt(command.split(" ")[1]);
                    int endIndexSum = Integer.parseInt(command.split(" ")[2]);
                    int Sum = 0;
                    if (sb.length()>=endIndexSum && startIndexSum>=0){
                        String subString = sb.substring(startIndexSum,endIndexSum+1);
                        for (int i = 0; i < subString.length(); i++) {
                            Sum+=subString.charAt(i);
                        }
                        System.out.println(Sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                break;
            }
            command = scanner.nextLine();
        }
    }
}
