package Methods;

import java.util.Scanner;
/*
@CIHAN GUR

Create a method that calculates and returns the area of a rectangle
by given width and length.

 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = calculateArea(width,height);
        System.out.println(area);
    }

    public static int calculateArea(int w,int h){
        return (w*h);
    }
}
