import java.util.Scanner;

/*
@CIHAN GUR

Calculate how many courses will be needed to elevate n persons by using
an elevator with a capacity of p persons. The input holds two lines: the
number of people n and the capacity p of the elevator.

 */
public class Elavator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int totalPeople = inp.nextInt();
        int capacity = inp.nextInt();
        int tour=0;
        while (totalPeople>0){
            totalPeople-=capacity;
            tour++;
        }
        System.out.println(tour);
    }
}
