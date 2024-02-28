package Arrays;

import java.util.Scanner;

/*
@CIHAN GUR

You will be given a count of wagons in a train n. On the next n lines,
you will receive how many people will get on that wagon. In the end,
print the whole train and the sum of the people on the train

 */
public class Train {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        int[] train = new int[n];
        int total=0;
        for (int i=0; i<n; i++ ){
            int capacity = Integer.parseInt(inp.nextLine());
            train[i]=capacity;
            total+=capacity;
        }
        for (int i=0; i<n; i++ ){
            System.out.print(train[i]+" ");
        }
        System.out.println();
        System.out.println(total);
    }
}