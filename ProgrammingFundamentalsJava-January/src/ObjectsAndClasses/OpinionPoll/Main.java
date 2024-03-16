package ObjectsAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Using the Person class, write a program that reads from the console N lines of personal
information and then prints all people whose age is more than 30 years.
INPUT
3
Peter 12
Sam 31
Itan 48
OUPUT
Sam – 31
Itan - 48

INPUT
5
Niko 33
Yana 88
Todor 22
Lisa 44
Sam 11
OUTPUT
Niko - 33
Yana - 88
Lisa - 44

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        while (n>0){
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);
            Person p1 = new Person(name,age);
            if (age>30){
                personList.add(p1);
            }
            n--;
        }
        for (Person list : personList){
            System.out.printf("%s - %d\n",list.getName(),list.getAge());
        }
    }
}
