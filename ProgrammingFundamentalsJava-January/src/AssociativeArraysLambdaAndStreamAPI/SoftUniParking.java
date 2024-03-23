package AssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
@CIHAN GUR

SoftUni just got a new parking lot. It's so fancy, it even has online parking validation.
Except, the online service doesn't work. It can only receive users' data but doesn't know
what to do with it. Good thing you're on the dev team and know how to fix it, right?
Write a program that validates parking for an online service. Users can register to park
 and unregister to leave.
The program receives 2 commands:
"register {username} {licensePlateNumber}":
The system only supports one car per user at the moment, so if a user tries to register
another license plate using the same username, the system should print: "ERROR: already
registered with plate number {licensePlateNumber}"
If the aforementioned checks pass successfully, the plate can be registered, so the system
should print: "{username} registered {licensePlateNumber} successfully"
"unregister {username}":
If the user is not present in the database, the system should
print: "ERROR: user {username} not found"
If the aforementioned check passes successfully, the system should
print: "{username} unregistered successfully"
After you execute all of the commands, print all the currently registered users and their
license plates in the format:
"{username} => {licensePlateNumber}"
Input
First line: n - number of commands – integer.
Next n lines: commands in one of two possible formats:
Register: "register {username} {licensePlateNumber}"
Unregister: "unregister {username}"
The input will always be valid, and you do not need to check it explicitly.

INPUT
5
register John CS1234JS
register George JAVA123S
register Andy AB4142CD
register Jesica VR1223EE
unregister Andy
OUTPUT
John registered CS1234JS successfully
George registered JAVA123S successfully
Andy registered AB4142CD successfully
Jesica registered VR1223EE successfully
Andy unregistered successfully
John => CS1234JS
George => JAVA123S
Jesica => VR1223EE

INPUT
4
register Jony AA4132BB
register Jony AA4132BB
register Linda AA9999BB
unregister Jony
OUPUT
Jony registered AA4132BB successfully
ERROR: already registered with plate number AA4132BB
Linda registered AA9999BB successfully
Jony unregistered successfully
Linda => AA9999BB

INPUT
6
register Jacob MM1111XX
register Anthony AB1111XX
unregister Jacob
register Joshua DD1111XX
unregister Lily
register Samantha AA9999BB
OUTPUT
Jacob registered MM1111XX successfully
Anthony registered AB1111XX successfully
Jacob unregistered successfully
Joshua registered DD1111XX successfully
ERROR: user Lily not found
Samantha registered AA9999BB successfully
Anthony => AB1111XX
Joshua => DD1111XX
Samantha => AA9999BB

*/
public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Map<String,String> registration = new LinkedHashMap<>();


        while (N>0){
            String command = scanner.nextLine();
            String type = command.split(" ")[0];
            String name = command.split(" ")[1];
            switch (type){
                case "register" :
                    String plate = command.split(" ")[2];
                    if (registration.containsKey(name)){
                        System.out.println("ERROR: already registered with plate number "+plate);
                    } else {
                        System.out.println(name+" registered "+plate+" successfully");
                        registration.put(name,plate);
                    }
                    break;
                case "unregister" :
                    if (registration.containsKey(name)){
                        System.out.println(name+" unregistered successfully");
                        registration.remove(name);
                    } else {
                        System.out.println("ERROR: user "+name+" not found");
                    }
                    break;
            }

            N--;
        }
        for(Map.Entry<String,String> records : registration.entrySet()){
            System.out.println(records.getKey()+" => "+records.getValue());
        }
    }
}
