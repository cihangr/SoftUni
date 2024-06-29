package StacksAndQueues.PrinterQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

/*
@CIHAN GUR

The printer queue is a simple way to control the order of files sent to a printer device.
We know that a single printer can be shared between multiple devices. So to preserve the
order of the files sent, we can use a queue.
Write a program which takes filenames until the "print" command is received.
Then as output, print the filenames in the order of printing. Some of the tasks may be canceled.
If you receive "cancel" you have to remove the first file to be printed. If there is no current
file to be printed, print "Printer is on standby".

INPUT
Lab.docx
cancel
cancel
Presentation.pptx
NoteNothing.txt
SomeCode.java
cancel
print

OUTPUT
Canceled Lab.docx
Printer is on standby
Canceled Presentation.pptx
NoteNothing.txt
SomeCode.java

INPUT
Presentation.pptx
cancel
Text.txt
cancel
cancel
cancel
print

OUTPUT
Canceled Presentation.pptx
Canceled Text.txt
Printer is on standby
Printer is on standby

*/
public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("print")){

            if (input.equals("cancel")){
                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
