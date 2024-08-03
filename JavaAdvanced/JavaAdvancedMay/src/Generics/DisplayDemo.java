package Generics;

//Using <E> for different type of data types is called GENERICS!

public class DisplayDemo<E> {
    public void display(E first, E second, E third, E fourth) {
        System.out.print(first+" ");
        System.out.print(second+" ");
        System.out.print(third+" ");
        System.out.print(fourth+" ");
        System.out.println();
    }
}
