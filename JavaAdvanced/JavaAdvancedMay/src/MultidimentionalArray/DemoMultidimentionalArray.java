package MultidimentionalArray;

import java.util.concurrent.ThreadLocalRandom;

public class DemoMultidimentionalArray {
    public static void main(String[] args) {

        //Simple array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1000);
        }
        for (int n : arr){
            System.out.println(n);
        }

        //2 dimensional array. Matrix
        int[][] matrix = new int[10][12];

        System.out.println(matrix.length);

    }
}
