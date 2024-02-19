/*   @cihangr

Write a program that:
Reads 3 lines of input – student name, age and average grade
Print all the info about the student in the following format:
"Name: {student name}, Age: {student age}, Grade: {student grade}".

 */

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        double grade = Double.parseDouble(input.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
