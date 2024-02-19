import java.util.Scanner;
/*
@CIHAN GUR

You are given the coordinates of four points in the 2D plane. The first and the second
pair of points form two different lines. Print the longer line in the format
"(X1, Y1)(X2, Y2)" starting with the point that is closer to the
center of the coordinate system (0, 0) (You can reuse the method that you wrote for the
previous problem). If the lines are of equal length, print only the first one.
Input
2
4
-1
2
-5
-5
4
-3
Output
(4, -3)(-5, -5)
 */
public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        int finalX1,finalY1,finalX2,finalY2;
        if (getLength(x1,y1,x2,y2)>=getLength(x3,y3,x4,y4)){
            finalX1 = x1;
            finalY1 = y1;
            finalX2 = x2;
            finalY2 = y2;
        } else {
            finalX1 = x3;
            finalY1 = y3;
            finalX2 = x4;
            finalY2 = y4;
        }
        if (getDistance(finalX1,finalY1)<=getDistance(finalX2,finalY2)){
            System.out.println("("+finalX1+", "+finalY1+")"+"("+finalX2+", "+finalY2+")");
        } else {
            System.out.println("("+finalX2+", "+finalY2+")"+"("+finalX1+", "+finalY1+")");
        }
    }
    public static double getLength (int i1, int j1, int i2, int j2){
        return  Math.sqrt(Math.pow(i2-i1,2)+Math.pow(j2-j1,2));
    }
    public static double getDistance(int x, int y){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

}
