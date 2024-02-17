import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

You are tasked to help plan the next Programming Fundamentals course by keeping track of
the lessons that will be included in the course, as well as all the exercises for the lessons.

On the first input line, you will receive the initial schedule of lessons and exercises
that will be part of the next course, separated by a comma and space ", ". But before
the course starts, there are some changes to be made. Until you receive "course start",
you will be given some commands to modify the course schedule. The possible commands are:

· Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
· Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
· Remove:{lessonTitle} - remove the lesson, if it exists
· Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
· Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if
    the lesson exists and there is no exercise already, in the following format:
    "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson at the end
    of the course schedule, followed by the Exercise.

Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any,
which follow the lessons.

Input
· On the first line -the initial schedule lessons -strings, separated by comma and space ", ".
· Until "course start", you will receive commands in the format described above.

Output
· Print the whole course schedule, each lesson on a new line with its number(index) in the
    schedule: "{lesson index}.{lessonTitle}".
· Allowed working time / memory: 100ms / 16MB.

INPUT
Data Types, Objects, Lists
Add:Databases
Insert:Arrays:0
Remove:Lists
course start
OUTPUT
1.Arrays 2.Data Types 3.Objects 4.Databases

INPUT
Arrays, Lists, Methods
Swap:Arrays:Methods
Exercise:Databases
Swap:Lists:Databases
Insert:Arrays:0
course start
OUTPUT
1.Methods
2.Databases
3.Databases-Exercise
4.Arrays
5.Lists

INPUT
Arrays, Lists, Methods
Swap:Arrays:Methods
Exercise:Databases
Swap:Lists:Databases
Insert:Arrays:0
course start
OUTPUT
1.Methods
2.Databases
3.Databases-Exercise
4.Arrays
5.Lists

*/
public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("course start")){
            String command = commandLine.split(":")[0];
            String lessonName = commandLine.split(":")[1];
            switch (command){
                case "Add" :
                    if (!lessons.contains(lessonName)){
                        lessons.add(lessonName);
                    }
                    break;
                case "Insert" :
                    int index = Integer.parseInt(commandLine.split(":")[2]);
                    if (!lessons.contains(lessonName)){
                        lessons.add(index,lessonName);
                    }
                    break;
                case "Remove" :
                    lessons.remove(lessonName);
                    lessons.remove(lessonName+"-Exercise");
                    break;
                case "Swap" :
                    String lessonForSwap = commandLine.split(":")[2];
                    int lessonIndex = lessons.indexOf(lessonName);
                    int lessonForSwapIndex = lessons.indexOf(lessonForSwap);

                    if (lessons.contains(lessonName) && lessons.contains(lessonForSwap)){
                        lessons.remove(lessonName);
                        lessons.add(lessonForSwapIndex, lessonName);
                        lessons.remove(lessonForSwap);
                        lessons.add(lessonIndex, lessonForSwap);
                    }

                    String lessonNameExercise = lessonName+"-Exercise";
                    String lessonForSwapExercise = lessonForSwap+"-Exercise";

                    if (lessons.contains(lessonNameExercise)){
                        lessons.remove(lessonNameExercise);
                        lessons.add(lessonForSwapIndex+1,lessonNameExercise);
                    }
                    if (lessons.contains(lessonForSwapExercise)){
                        lessons.remove(lessonForSwapExercise);
                        lessons.add(lessonIndex+1,lessonForSwapExercise);
                    }

                    break;
                case "Exercise" :
                    String exerciseName =lessonName + "-Exercise";
                    if (lessons.contains(lessonName)){
                        if (!lessons.contains(exerciseName)){
                            int indexOfTheLesson = lessons.indexOf(lessonName);
                            lessons.add(indexOfTheLesson+1,exerciseName);
                        }
                    } else {
                        lessons.add(lessonName);
                        lessons.add(lessonName+"-Exercise");
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        int number = 1;
        for (String lesson : lessons){
            System.out.println(number+"."+lesson);
            number++;
        }
    }
}
