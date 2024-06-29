package StacksAndQueues.SimpleTextEditor;
/*
@CIHAN GUR

You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
"1 {string}" - appends [string] to the end of the text.
"2 {count}" - erases the last [count] elements from the text.
"3 {index}" - returns the element at position [index] from the text.
"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
Input
The first line contains N, the number of operations, where 1 ≤ N ≤ 105.
Each of the following N lines contains the name of the operation, followed by the command argument,
if any, separated by space in the following format "command argument".
The length of the text will not exceed 1000000.
All input characters are English letters.
It is guaranteed that the sequence of input operations is possible to perform.
Output
For each operation of type "3" print a single line with the returned character of that operation.


INPUT
8
1 abc
3 3
2 3
1 xy
3 2
4
4
3 1
OUTPUT
c
y
a

INPUT
6
1 Soft
1 Uni
2 1
3 1
1 be
3 2
OUTPUT
S
o
*/
public class SimpleTextEditor {
    public static void main(String[] args) {

    }
}
