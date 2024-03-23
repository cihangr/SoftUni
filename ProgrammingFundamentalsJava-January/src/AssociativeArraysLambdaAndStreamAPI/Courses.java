package AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

/*
@CIHAN GUR

Write a program which keeps the information about courses. Each course has a name
and registered students.
You will receive the course name and student name until you receive the command "end".
Check if such a course already exists and if not - add the course. Register the user
into the course. When you do receive the command "end", print the courses with their
names and total registered users. For each contest, print the registered users.
Input
Until you receive "end", the input come in the format: "{courseName} : {studentName}".
The product data is always delimited by " : ".
Output
Print information about each course, following the format:  "{courseName}: {registeredStudents}"
Print information about each student, following the format: "-- {studentName}"

INPUT
Programming Fundamentals : John Smith
Programming Fundamentals : Linda Johnson
JS Core : Will Wilson
Java Advanced : Harrison White
end
OUTPUT
Programming Fundamentals: 2
-- John Smith
-- Linda Johnson
JS Core: 1
-- Will Wilson
Java Advanced: 1
-- Harrison White

INPUT
Algorithms : Jay Moore
Programming Basics : Martin Taylor
Python Fundamentals : John Anderson
Python Fundamentals : Andrew Robinson
Algorithms : Bob Jackson
Python Fundamentals : Clark Lewis
end
OUTPUT
Algorithms: 2
-- Jay Moore
-- Bob Jackson
Programming Basics: 1
-- Martin Taylor
Python Fundamentals: 3
-- John Anderson
-- Andrew Robinson
-- Clark Lewis

*/
public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> Courses = new LinkedHashMap<>();

        String courseInfo = scanner.nextLine();
        while(!courseInfo.equals("end")){
            String courseName = courseInfo.split(" : ")[0];
            String student = courseInfo.split(" : ")[1];
            Courses.putIfAbsent(courseName,new ArrayList<>());
            Courses.get(courseName).add(student);

            courseInfo = scanner.nextLine();
        }
        for(Map.Entry<String,List<String>> courses : Courses.entrySet()){
            String courseName = courses.getKey();
            List<String> studentsList = courses.getValue();
            System.out.printf("%s: %d\n", courseName, studentsList.size());
            studentsList.forEach(name -> System.out.printf("-- %s\n",name));
        }
    }
}
