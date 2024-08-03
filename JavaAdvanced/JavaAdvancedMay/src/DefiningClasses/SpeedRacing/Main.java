package DefiningClasses.SpeedRacing;
/*
@CIHAN GUR

Your task is to implement a program that keeps track of cars and their fuel and supports methods for moving the cars.
Define a class Car that keeps track of a car information Model, fuel amount, fuel cost for 1 kilometer, and distance
traveled. A Car Model is unique - there will never be 2 cars with the same model.
On the first line of the input, you will receive a number N - the number of cars you need to track, on each of the
next N lines you will receive information for a car in the following format "{Model} {FuelAmount} {FuelCostFor1km}",
all cars start at 0 kilometers traveled. After the N lines, until the command "End" is received, you will receive
commands in the following format "Drive {CarModel} {amountOfKm}", implement a method in the Car class to calculate
whether a car can move that distance or not. If yes, the car fuel amount should be reduced by the amount of used
fuel, and its distance traveled should be increased by the amount of kilometers traveled, otherwise, the car should
not move (Its fuel amount and distance traveled should stay the same) and you should print on the console
"Insufficient fuel for the drive". After the "End" command is received, print each car in order of appearing
in input, and its current fuel amount and distance traveled in the format "{Model} {fuelAmount} {distanceTraveled}",
where the fuel amount should be printed to two decimal places after the separator.

>>>>>INPUT
2
AudiA4 23 0.3
BMW-M2 45 0.42
Drive BMW-M2 56
Drive AudiA4 5
Drive AudiA4 13
End
>>>>>OUTPUT
AudiA4 17.60 18
BMW-M2 21.48 56

>>>>>INPUT
3
AudiA4 18 0.34
BMW-M2 33 0.41
Ferrari-488Spider 50 0.47
Drive Ferrari-488Spider 97
Drive Ferrari-488Spider 35
Drive AudiA4 85
Drive AudiA4 50
End
>>>>>OUTPUT
Insufficient fuel for the drive
Insufficient fuel for the drive
AudiA4 1.00 50
BMW-M2 33.00 0
Ferrari-488Spider 4.41 97
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String carInfo = scanner.nextLine();
            String[] tokens = carInfo.split("\\s+");
            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double costPerKm = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuel, costPerKm);
            cars.add(car);
        }

        String input = scanner.nextLine();
        while(!input.equals("End")){
            String model = input.split(" ")[1];
            int kmToDrive = Integer.parseInt(input.split(" ")[2]);

            Car car = getCarByModel(cars, model);
            car.drive(kmToDrive);
            input = scanner.nextLine();
        }
        cars.forEach(car -> System.out.println(car));
        
    }
    private static Car getCarByModel(List<Car> cars, String model){
        for (Car car : cars){
            if (car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }
}
