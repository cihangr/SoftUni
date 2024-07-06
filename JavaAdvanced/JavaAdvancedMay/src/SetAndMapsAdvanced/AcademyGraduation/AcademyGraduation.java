package SetAndMapsAdvanced.AcademyGraduation;
/*
@CIHAN GUR

Write a program that:
Reads from console number of students for a track.
Reads on pair of rows:
The first line is the name of the student.
The second line is his score for a different number of courses.
Print on console "{name} is graduated with {average scores)".

>>>>>INPUT
3
George
3.75 5
Maria
4.25 6
Peter
6 4.5
>>>>>OUTPUT
George is graduated with 4.375
Maria is graduated with 5.125
Peter is graduated with 5.25

>>>>>INPUT
5
George
4.36 5.50 3.30 5.63 2.57 5.75 2.81 4.89
Peter
3.10 5.35 3.30 3.35 5.64 4.99 2.75 4.68
Maria
3.45 3.23 3.03 5.42 5.46 4.15 2.26 5.95
Rosalia
2.08 3.48 3.36 2.73 2.96 4.54 3.70 3.85
John
4.75 4.92 3.78 4.79 4.82 4.75 2.81 2.13
>>>>>OUTPUT
George is graduated with 4.351249999999999
John is graduated with 4.09375
Maria is graduated with 4.11875
Peter is graduated with 4.145
Rosalia is graduated with 3.3375
*/
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double[]> students = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String name = scanner.nextLine();
            String[] scoresString = scanner.nextLine().split(" ");
            Double[] scores = new Double[scoresString.length];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = Double.parseDouble(scoresString[i]);
            }
            students.putIfAbsent(name,scores);
        }
        for (Map.Entry<String, Double[]> entry : students.entrySet()) {
            System.out.printf("%s is graduated with %.3f\n",entry.getKey(), Average(entry.getValue()));
        }
    }
    private static double Average(Double[] scores) {
        double sum = 0;
        for (Double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
