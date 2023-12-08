import java.util.Scanner;

public class combinations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = Integer.parseInt(inp.nextLine());
        int validCombinations=0;
        for (int i=0; i<=N;i++){
            for (int j=0; j<=N;j++){
                for (int h=0; h<=N; h++){
                    if ((i+j+h)==N){
                        validCombinations++;
                    }
                }
            }
        }
        System.out.println(validCombinations);
    }
}
