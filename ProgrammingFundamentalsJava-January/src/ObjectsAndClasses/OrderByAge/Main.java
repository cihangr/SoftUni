package ObjectsAndClasses.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

You will receive an unknown number of lines. On each line, you will receive an array with 3 elements.
The first element will be a string and represents the name of the person. The second element will be
a string and will represent the ID of the person. The last element will be an integer which represents
the age of the person.

When you receive the command "End", stop taking input and print all the people, ordered by age.

INPUT
George 123456 20
Peter 78911 15
Stephan 524244 10
End
OUTPUT
Stephan with ID: 524244 is 10 years old.
Peter with ID: 78911 is 15 years old.
George with ID: 123456 is 20 years old.

INPUT
Cindy 88611 2
Kaloyan 13967 3
Simona 53316 11
Gil 31837 72
End
OUTPUT
Cindy with ID: 88611 is 2 years old.
Kaloyan with ID: 13967 is 3 years old.
Simona with ID: 53316 is 11 years old.
Gil with ID: 31837 is 72 years old.


*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<People> peopleList =new ArrayList<>();
        String command = scanner.nextLine();
        while(!command.equals("End")){
            String name = command.split(" ")[0];
            int ID = Integer.parseInt(command.split(" ")[1]);
            int age = Integer.parseInt(command.split(" ")[2]);
            People p1 = new People(name,ID,age);
            peopleList.add(p1);
            command = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparing(People::getAge));
        for (People prs : peopleList){
            System.out.printf("%s with ID: %d is %d years old.\n",prs.getName(),prs.getID(),prs.getAge());
        }
    }
}
