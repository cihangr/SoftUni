package InterfaceAndAbstraction.Telephony;

import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

You have a business - manufacturing cell phones. But you have no software developers, so you call your friends
and ask them to help you create cell phone software. They agree and you start working on the project. The project
consists of one main model - a Smartphone. Each of your smartphones should have functionalities of calling other
phones and browsing on the world wide web.
Your friends are very busy, so you decide to write the code on your own. Here is the mandatory assignment:
You should have a model - Smartphone and two separate functionalities which your smartphone has - to call other
phones and to browse the world wide web. You should end up with one class and two interfaces.

INTERFACE 1
<<Interface>>
Callable
call(): String

INTERFACE 2
<<Interface>>
Browsable
browse(): String

SMARTPHONE
numbers: List<String>
urls: List<String>
Smartphone(List<String>, List<String>)
call(): String
browse(): String

Input
The input comes from the console. It will hold two lines:
First line: phone numbers to call (String), separated by spaces.
Second line: sites to visit (String), separated by spaces.
Output
First, call all numbers in the order of input then browse all sites in order of input.
The functionality of calling phones is printing on the console the number which is being called in the format: "Calling... {number}".
The functionality of the browser should print on the console the site in the format:
"Browsing: {site}!" (pay attention to the exclamation mark when printing URLs).
If there is a number in the input of the URLs, print: "Invalid URL!" and continue printing the rest of the URLs.
If there is a character different from a digit in a number, print: "Invalid number!" and continue to the next number.
Constraints
Each site's URL should consist only of letters and symbols (No digits are allowed in the URL address).


>>>>>INPUT
0882134215 0882134333 08992134215 0558123 3333 1
http://softuni.bg http://youtube.com http://www.g00gle.com
>>>>>OUTPUT
Calling... 0882134215
Calling... 0882134333
Calling... 08992134215
Calling... 0558123
Calling... 3333
Calling... 1
Browsing: http://softuni.bg!
Browsing: http://youtube.com!
Invalid URL!

>>>>>INPUT
0884542465 0895321654 25632 06014532 123
http://softuni.bg http://www.g00gle.com http://facebook.com
>>>>>OUTPUT
Calling... 0884542465
Calling... 0895321654
Calling... 25632
Calling... 06014532
Calling... 123
Browsing: http://softuni.bg!
Invalid URL!
Browsing: http://facebook.com!
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phoneNumbers = scanner.nextLine().split("\\s+");
        String[] urls = scanner.nextLine().split("\\s+");
        Smartphone smartphone = new Smartphone(List.of(phoneNumbers),List.of(urls));
        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
