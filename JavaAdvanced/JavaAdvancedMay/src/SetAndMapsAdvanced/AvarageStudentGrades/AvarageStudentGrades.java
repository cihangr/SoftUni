package SetAndMapsAdvanced.AvarageStudentGrades;

import java.util.*;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Write a program, which reads the name of a student and their grades and adds them to the student record,
then prints grades along with their average grade – ordered the output by the students' names.
Input
On the first line N – the number of students, then on the next, N lines student name with grade.

>>>>>INPUT
7
Stephan 5.20
Maria 5.50
Stephan 3.20
Maria 2.50
Alex 2.00
Maria 3.46
Alex 3.00
>>>>>OUTPUT
Alex -> 2.00 3.00 (avg: 2.50)
Maria -> 5.50 2.50 3.46 (avg: 3.82)
Stephan -> 5.20 3.20 (avg: 4.20)

>>>>>INPUT
4
Alex 4.50
Peter 3.00
Alex 5.00
Peter 3.66
>>>>>OUTPUT
Alex -> 4.50 5.00 (avg: 4.75)
Peter -> 3.00 3.66 (avg: 3.33)


>>>>>INPUT
5
George 6.00
George 5.50
George 6.00
Alex 4.40
Peter 3.30
Peter 4.50
>>>>>OUTPUT
Alex -> 4.40 (avg: 4.40)
George -> 6.00 5.50 6.00 (avg: 5.83)
Peter -> 3.30 (avg: 3.30)
*/
public class AvarageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // number of lines
        Map<String, List<Double>> studentGrades = new TreeMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String studentName = tokens[0];
            double grade = Double.parseDouble(tokens[1]);

            studentGrades.putIfAbsent(studentName, new ArrayList<>());
            List<Double> list = studentGrades.get(studentName);
            list.add(grade);
        }
        for (var entry : studentGrades.entrySet()){
            String name = entry.getKey();
            String grade = entry.getValue().stream().map(g -> String.format("%.2f",g)).collect(Collectors.joining(" "));
            double avg = entry.getValue().stream().mapToDouble(g -> g).average().getAsDouble();
            System.out.println(String.format("%s -> %s (avg: %.2f)",name,grade,avg));
        }


    }
}














