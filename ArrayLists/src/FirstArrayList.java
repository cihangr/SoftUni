import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Making the First Array List
 */
public class FirstArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> firstArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstArray.add(number);
        }
        for (int i = 0; i < firstArray.size(); i++) {
            System.out.printf("arr[%d]=%s\n",i,firstArray.get(i));
        }
    }
}