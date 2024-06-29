package StacksAndQueues.BrowserHistoryUpgrade;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
@CIHAN GUR

Extend "Browser History" with a "forward" instruction, which visits URLs that were navigated away from by "back".

Each forward instruction visits the next most recent such URL. If normal navigation happens,
all potential forward URLs are removed until a new back instruction is given if the forward
instruction can't be executed, print "no next URLs".

>>>>>INPUT
forward
https//softuni.bg/
https//softuni.bg/trainings/courses
back
forward
https//softuni.bg/trainings/2056
back
forward
forward
https//softuni.bg/trainings/courses
Home
>>>>>OUTPUT
no next URLs
https//softuni.bg/
https//softuni.bg/trainings/courses
https//softuni.bg/
https//softuni.bg/trainings/courses
https//softuni.bg/trainings/2056
https//softuni.bg/trainings/courses
https//softuni.bg/trainings/2056
no next URLs
https//softuni.bg/trainings/courses

>>>>>INPUT
back
https//google.bg/
https//google.bg/softuni
back
forward
https//google.bg/java/advanced
back
forward
https//google.bg/java/oop
back
https//google.bg/java/oop
Home
>>>>>OUTPUT
no previous URLs
https//google.bg/
https//google.bg/softuni
https//google.bg/
https//google.bg/softuni
https//google.bg/java/advanced
https//google.bg/softuni
https//google.bg/java/advanced
https//google.bg/java/oop
https//google.bg/java/advanced
https//google.bg/java/oop
*/
public class browserHistoryUpgrade {
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
