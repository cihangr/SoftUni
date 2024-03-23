package AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
@CIHAN GUR

Write a program that keeps the information about students and their grades.
On the first line, you will receive number n. After that, you will receive n pair of rows.
First, you will receive the student's name, after that, you will receive his grade.
Check if the student already exists and if not - add him. Keep track of all grades
for each student.
When you finish reading data, keep students with an average grade higher or equal to 4.50.
Print the students and their average grade in the format:
"{name} –> {averageGrade}"
Format the average grade to the 2nd decimal place.

INPUT
5
John
5.5
John
4.5
Alice
6
Alice
3
George
5
OUTPUT
John -> 5.00
Alice -> 4.50
George -> 5.00

INPUT
5
Amanda
3.5
Amanda
4
Rob
5.5
Christian
5
Robert
6
OUTPUT
Rob -> 5.50
Christian -> 5.00
Robert -> 6.00

*/
public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Double> studentsRecord = new LinkedHashMap<>();

        while (n>0){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentsRecord.putIfAbsent(name,grade);
            if (studentsRecord.containsKey(name)){
                double previousGrade = studentsRecord.get(name);
                studentsRecord.put(name,(previousGrade+grade)/2);
            }
            n--;
        }
        for(Map.Entry<String,Double> result : studentsRecord.entrySet()){
            if (result.getValue()>=4.5){
                System.out.printf("%s -> %.2f\n",result.getKey(),result.getValue());
            }
        }
    }
}
