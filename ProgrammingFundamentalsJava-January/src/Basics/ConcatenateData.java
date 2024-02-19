package Basics;

import java.util.Scanner;

public class ConcatenateData {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            String surname = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            String town = scan.nextLine();
            System.out.println("Your name is "+name+" "+surname+", a "+age+"-years old from "+town+".");

        }
    }
