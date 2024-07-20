package SetAndMapsAdvanced.FIxEmails;
/*
@CIHAN GUR

You are given a sequence of strings, each on a new line, until you receive the "stop" command.
The first string is a name of a person. On the second line, you receive his email. Your task is
to collect their names and emails and remove emails whose domain ends with "us", "uk," or "com"
(case insensitive). Print in the following format:
"{name} – > {email}"

>>>>>INPUT
John
johnDoe@softuni.org
Peter Smith
smith.peter@softuni.org
Taylor Baker
baker@gmail.com
stop
>>>>>OUTPUT
John -> johnDoe@softuni.org
Peter Smith -> smith.peter@softuni.org

>>>>>INPUT
Peter Adamas
peter_adams@gmail.com
Anna Foster
foster.anna@yahoo.com
Duke Jenkins
jenkins.duke@softuni.org
stop
>>>>>OUTPUT
Duke Jenkins -> jenkins.duke@softuni.org

*/
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String , String> emails = new LinkedHashMap<>();
        String stopper = scanner.nextLine();
        while(!stopper.equals("stop")){
            String name = stopper;
            String email = scanner.nextLine();
            Pattern pattern = Pattern.compile(".*\\.(us|uk|com)$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()) {
                emails.put(name, email);
            }
            stopper = scanner.nextLine();
        }
        for (String e : emails.keySet()){
            System.out.printf("%s -> %s\n",e, emails.get(e));
        }



    }
}
