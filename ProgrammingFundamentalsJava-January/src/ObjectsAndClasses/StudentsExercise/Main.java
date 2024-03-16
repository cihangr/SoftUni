package ObjectsAndClasses.StudentsExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that receives n count of students and orders them by grade (in descending).
Each student should have a first name (string), a last name (string),
and a grade (a floating-point number).

Input
· First-line will be a number n.
· Next n lines you will get student info in the format "{first name} {second name} {grade}".
Output
· Print each student in the following format "{first name} {second name}: {grade}".

INPUT
4
Lakia Eason 3.90
Prince Messing 5.49
Akiko Segers 4.85
Rocco Erben 6.00
OUTPUT
Rocco Erben: 6.00
Prince Messing: 5.49
Akiko Segers: 4.85
Lakia Eason: 3.90

INPUT
4
Sydnie Britton 5.79
Amias Mathews 2.30
Mora Tod 2.78
Pete Kendrick 2.61
OUTPUT
Sydnie Britton: 5.79
Mora Tod: 2.78
Pete Kendrick: 2.61
Amias Mathews: 2.30

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> student = new ArrayList<>();
        while (n>0){
            String data = scanner.nextLine();
            String name = data.split(" ")[0];
            String surName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);
            Students st1 = new Students(name,surName,grade);
            student.add(st1);
            n--;
        }
        student.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students stu : student){
            System.out.printf("%s %s: %.2f\n",stu.getFirstName(),stu.getLastName(),stu.getGrade());
        }
    }

}
