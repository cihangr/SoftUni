package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Define a class Student, which holds the following information about students:
first name, last name, age, and hometown.
Read the list of students until you receive the "end" command. After that,
you will receive a city name. Print only students which are from the given city,
in the following format: "{firstName} {lastName} is {age} years old".

INPUT
John Smith 15 Sofia
Peter Ivanov 14 Plovdiv
Linda Bridge 16 Sofia
Simon Stone 12 Varna
end
Sofia
OUTPUT
John Smith is 15 years old
Linda Bridge is 16 years old

INPUT
Anthony Taylor 15 Chicago
David Anderson 16 Washington
Jack Lewis 14 Chicago
David Lee 14 Chicago
end
Chicago
OUTPUT
Anthony Taylor is 15 years old
Jack Lewis is 14 years old
David Lee is 14 years old

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> lists = new ArrayList<>();
        String command = scanner.nextLine();
        while(!command.equals("end")){
            String[] data = command.split(" ");
            String name = data[0];
            String surname = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];
            Students stu = new Students(name,surname,age,city);
            lists.add(stu);

            command = scanner.nextLine();
        }

        for (Students list : lists){
            System.out.println();
        }
    }
}
