package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
@CIHAN GUR

Create a program, that checks if inputs are a valid password and encrypt it. On the first line you will
receive a number that indicates how many inputs you will receive on the next lines.
A password is valid when:
It starts with a group of  symbols and ends with the same symbols (the same length) - All symbols are possible
There is a greater than sign (">") after the first group and a less than sign ("<") before the last one
In between the greater than sign and the less than sign there are four groups (each of three characters),
separated by pipe ("|")
The first group consists only of numbers
The second group – only lower case letters
The third one – only upper case letters
The fourth one – all symbols except "<" and ">"
Example for a valid message:
"$$$>312|dfe|KFE|@!#<$$$"
You must check if the password is valid and if it is - encrypt it, if it isn’t - print the following message:
"Try another password!"
Encrypting a password means to take all numbers, letters and symbols from the middle four groups and
concatenatе them. After successful encrypt, print it in the following format:
"Password: {encrypted password}"
Input
On the first line - n - the count of inputs.
On the next n lines - input that you have to check if it has a valid password.
Output
Print all results from each input, each on a new line.

INPUT
3
##>00|no|NO|!!!?<###
##>123|yes|YES|!!!<##
$$<111|noo|NOPE|<<>$
OUTPUT
Try another password!
Password: 123yesYES!!!
Try another

INPUT
5
aa>111|mqu|BAU|mqu<aa
()>111!aaa!AAA!^&*<()
o>088|abc|AAA|***<o
asd>asd|asd|ASD|asd<asd
OUTPUT
Password: 111mquBAUmqu
Try another password!
Password: 088abcAAA***
Try another password!

*/
public class EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPasswords = Integer.parseInt(scanner.nextLine());
        String regex = "(.+)>(?<firstGroup>[0-9]{3,})\\|(?<secondGroup>[a-z]{3,})\\|(?<thirdGroup>[A-Z]{3,})\\|(?<fourthGroup>[^<>]{3,})<\\1";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < numberOfPasswords; i++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()){
                String newPassword = matcher.group("firstGroup")+matcher.group("secondGroup")+matcher.group("thirdGroup")+matcher.group("fourthGroup");
                System.out.println("Password: "+newPassword);
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
