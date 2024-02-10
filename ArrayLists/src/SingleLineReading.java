import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
@CIHAN GUR

Single Line ArrayList Reading
 */
public class SingleLineReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        List<String> str = Arrays.stream(values.split(" ")).collect(Collectors.toList());
        for (int i = 0; i < str.size(); i++) {
            System.out.printf("arr[%d]=%s\n",i,str.get(i));
        }

        
    }
}
