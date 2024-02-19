/*   @cihangr

You will be given a string representing a username. The password will be
that username reversed. Until you receive the correct password, print on
the console "Incorrect password. Try again.". When you receive the correct
password, print "User {username} logged in." However, on the fourth try,
if the password is still not correct, print "User {username} blocked!" and
end the program.

*/

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        String password;
        StringBuilder reversed = new StringBuilder();
        int trial=1;
        boolean check=true;
        for (int i=username.length()-1; i>=0; i--){
            reversed.append(username.charAt(i));
        }
        do{
            password = input.nextLine();
            if (trial>3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            if (password.contentEquals(reversed)){
                System.out.printf("User %s logged in.", username);
                check=false;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            trial++;
        } while (check);

    }
}
