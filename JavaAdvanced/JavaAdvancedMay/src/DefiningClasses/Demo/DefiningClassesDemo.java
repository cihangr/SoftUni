package DefiningClasses.Demo;

public class DefiningClassesDemo {
    public static void main(String[] args) {
        Book harryPotter = new Book("HarryPotter", "JK Rowling", 15,3);

        harryPotter.sell();
        harryPotter.sell();
        System.out.println(harryPotter.getQuantity());


    }
}
