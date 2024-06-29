package SetAndMapsAdvanced.ParkingLot;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
@CIHAN GUR

Write a program that:
o Records car numbers for every car that enters the parking lot.
o Removes car number when the car is out.
When the parking lot is empty, print "Parking Lot is Empty".
Input
The input will be a string in the format "{direction, carNumber}".
The input ends with the string "END".
Output
Print the output with all car numbers which are in the parking lot.

INPUT
IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
IN, CA9999TT
IN, CA2866HI
OUT, CA1234TA
IN, CA2844AA
OUT, CA2866HI
IN, CA9876HH
IN, CA2822UU
END
OUTPUT
CA9999TT
CA2844AA
CA9876HH
CA2822UU

INPUT
IN, CA2844AA
IN, CA1234TA
OUT, CA2844AA
OUT, CA1234TA
END
OUTPUT
Parking Lot is Empty
*/
public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingLot = new LinkedHashSet<>();

        while(true){
            String line = scanner.nextLine();
            if(line.equals("END")){
                break;
            } else {
                String[] tokens = line.split(", ");
                if (tokens[0].equals("IN")){
                    parkingLot.add(tokens[1]);
                } else if (tokens[0].equals("OUT")){
                    parkingLot.remove(tokens[1]);
                }
            }
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String list : parkingLot){
                System.out.println(list);
            }
        }

    }
}
