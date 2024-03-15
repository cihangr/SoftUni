package ObjectsAndClasses.Students2;

/*
@CIHAN GUR

Use the class from the previous problem. If you receive a student who already exists
(first name and last name should be unique), overwrite the information.
INPUT
John Smith 15 Sofia
John Smith 16 Sofia
Linda Bridge 17 Sofia
Simon Stone 12 Varna
end
Sofia
OUTPUT
John Smith is 16 years old
Linda Bridge is 17 years old

INPUT
J S 3 S
Peter Ivanov 14 P
P J 104 S
J P 61 S
Simon Stone 12 Varna
Simon Sone 12 Varna
end
Varna
OUTPUT
Simon Stone is 12 years old
Simon Sone is 12 years old

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> lists = new ArrayList<>();
        String command = scanner.nextLine();
        //Until End Command, loop will turn,
        while(!command.equals("end")){
            //we split the data and take the data into list,
            String[] data = command.split(" ");
            String name = data[0];
            String surname = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];
            //we check here if the given data is entered before or not. If entered, we change. if it's not, we add new.
            if (isStudentExist(lists, name, surname)){
                int i = getIndex(lists, name, surname);
                lists.get(i).setAge(age);
                lists.get(i).setCity(city);
            } else {
                Students stu = new Students(name,surname,age,city);
                lists.add(stu);
            }
            //we take command again for loop.
            command = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Students list : lists) {
            if (city.equals(list.getCity())) {
                System.out.printf("%s %s is %d years old\n", list.getName(), list.getSurname(), list.getAge());
            }
        }
    }

    private static int getIndex(List<Students> lists, String name, String surname) {
        int index = -1;
        for (int i = 0; i < lists.size(); i++) {
            Students stu = lists.get(i);
            if (stu.getName().equals(name) && stu.getSurname().equals(surname)){
                index = i;
            }
        }
        return index;
    }

    static boolean isStudentExist(List<Students> lists,String name, String surname){
        for (Students stu : lists){
            if (stu.getName().equals(name) && stu.getSurname().equals(surname)){
                return true;
            }
        }
        return false;
    }

}
