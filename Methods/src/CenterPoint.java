import java.util.Scanner;
/*
@CIHAN GUR

You are given the coordinates of two points on a Cartesian coordinate system
- X1, Y1, X2, and Y2. Create a method that prints the point that is closest
to the center of the coordinate system (0, 0) in the format (X, Y). If the
points are at the same distance from the center, print only the first one.

 */
public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (getDistance(x1,y1)<=getDistance(x2,y2)){
            System.out.println("("+x1+", "+y1+")");
        } else {
            System.out.println("("+x2+", "+y2+")");
        }
    }
    public static double getDistance(int x, int y){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
