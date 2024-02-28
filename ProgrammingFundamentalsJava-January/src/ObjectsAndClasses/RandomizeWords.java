package ObjectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

import static java.util.stream.Collectors.toList;

/*
@CIHAN GUR

You are given a list of words in one line. Randomize their order and print each word on a separate line.
INPUT
Welcome to SoftUni and have fun learning programming
OUTPUT
learning
Welcome
SoftUni
and
fun
programming
have
to

INPUT
Java is the best programming language
OUTPUT
the
programming
best
language
is
Java

*/
public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());



    }
}
