package StacksAndQueues.browserHistory;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
@CIHAN GUR

Browser History
Write a program that takes two types of browser instructions:
Normal navigation: a URL is set, given by a string;
The string "back" sets the current URL to the last set URL
After each instruction, the program should print the current URL. If the back instruction can't be executed,
print  "no previous URLs". The input ends with the "Home" command, and then you simply have to stop the program.
Examples

Input
https//softuni.bg/
back
https//softuni.bg/trainings/courses
back
https//softuni.bg/trainings/2056
back
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details
Home

Output
"https//softuni.bg/
no previous URLs
https//softuni.bg/trainings/courses
https//softuni.bg/
https//softuni.bg/trainings/2056
https//softuni.bg/
https//softuni.bg/trainings/live
https//softuni.bg/trainings/live/details"


Hints
Use ArrayDeque<>.
Use String to keep the current page.
Use push(), when moving to the next page.
Use pop(), when going back.


INPUT
https//google.bg/
https//google.bg/softuni
back
back
https//google.bg/java/advanced
back
https//google.bg/java/oop
Home

OUTPUT
https//google.bg/
https//google.bg/softuni
https//google.bg/
no previous URLs
https//google.bg/java/advanced
https//google.bg/
https//google.bg/java/oop

*/

public class browserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();


        String input = scanner.nextLine();
        String url = null;
        while(!input.equals("Home")){

            if(input.equals("back")){
                //do here
                if (history.isEmpty()){
                    System.out.println("no previous URLs");
                } else {
                    url = history.pop();
                    System.out.println(url);
                }
            } else {
                //do here
                if (url != null) {
                    history.push(url);
                }
                url = input;
                System.out.println(url);
            }



            input = scanner.nextLine();
        }
    }
}
