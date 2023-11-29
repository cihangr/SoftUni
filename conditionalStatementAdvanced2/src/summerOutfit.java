import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp = Integer.parseInt(inp.nextLine());
        String dayPart = inp.nextLine();
        String outfit="", shoes="";
        if (temp>=10 && temp<=18) {
            switch (dayPart){
                case "Morning": outfit="Sweatshirt";shoes="Sneakers"; break;
                case "Afternoon": outfit="Shirt";shoes="Moccasins"; break;
                case "Evening": outfit="Shirt";shoes="Moccasins"; break;
            }
        } else if (temp>18 && temp<=24) {
            switch (dayPart){
                case "Morning": outfit="Shirt";shoes="Moccasins"; break;
                case "Afternoon": outfit="T-Shirt";shoes="Sandals"; break;
                case "Evening": outfit="Shirt";shoes="Moccasins"; break;
            }
        } else if (temp>24) {
            switch (dayPart){
                case "Morning": outfit="T-Shirt";shoes="Sandals"; break;
                case "Afternoon": outfit="Swim Suit";shoes="Barefoot"; break;
                case "Evening": outfit="Shirt";shoes="Moccasins"; break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",temp,outfit,shoes);
    }
}
