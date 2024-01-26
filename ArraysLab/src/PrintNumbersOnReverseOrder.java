import java.util.Scanner;

/*
@CIHAN GUR

Read n numbers and print them in reverse order.
 */
public class PrintNumbersOnReverseOrder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i]=Integer.parseInt(inp.nextLine());
        }
        for (int j=N-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
    }
}
