import java.util.Scanner;

public class vovelsSum {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String name = inp.nextLine();
        int point=0;
        for (int i=0; i<name.length(); i++){
            switch (name.charAt(i)){
                case 'a': point+=1; break;
                case 'e': point+=2; break;
                case 'i': point+=3; break;
                case 'o': point+=4; break;
                case 'u': point+=5; break;
                default: break;
            }
        }
        System.out.println(point);
    }
}
