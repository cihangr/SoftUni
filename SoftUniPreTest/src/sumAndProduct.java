import java.util.Scanner;

public class sumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        int times, total, divide;

        for (int a = 1; a <= 9; a++) {
            for (int b = a; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = c; d <= 9; d++) {
                        total = a + b + c + d;
                        times = a * b * c * d;
                        divide = (int) ((double) times / total); // Cast to double before division

                        if (total == times && N % 5 == 0) {
                            System.out.println((a * 1000) + (b * 100) + (c * 10) + d);
                            return;
                        } else if (divide == 3 && N % 3 == 0) {
                            System.out.println((d * 1000) + (c * 100) + (b * 10) + a);
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Nothing found");
    }
}
