package WorkingWithAbstraction.Recap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        // we can assign the roles by entering here also.
        // we create ENUM file for roles
        Role role = Role.valueOf(scanner.nextLine());

        User user = new User(name, role);
        System.out.println(user);
        System.out.println(role.isAccessAllowed());
    }
}
