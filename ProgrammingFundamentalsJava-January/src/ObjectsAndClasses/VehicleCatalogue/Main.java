package ObjectsAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

You have to make a catalog for vehicles. You will receive two types of vehicles - a car or a truck.
Until you receive the command "End" you will receive lines of input in the format:
"{typeOfVehicle} {model} {color} {horsepower}"
After the "End" command, you will start receiving models of vehicles. Print for every received
vehicle its data in the format:

Type: {typeOfVehicle} Model: {modelOfVehicle} Color: {colorOfVehicle} Horsepower: {horsepowerOfVehicle}

When you receive the command "Close the Catalogue", stop receiving input and print the average
horsepower for the cars and the trucks in the format:

"{typeOfVehicles} have average horsepower of {averageHorsepower}."

The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by
the total count of vehicles from the same type.

Format the answer to the 2nd decimal point.
Constraints
· The type of vehicle will always be a car or truck.
· You will not receive the same model twice.
· The received horsepower will be an integer in the interval [1…1000].
· You will receive at most 50 vehicles.
· Single whitespace will be used for the separator.

INPUT
truck Man red 200
truck Mercedes blue 300
car Ford green 120
car Ferrari red 550
car Lamborghini orange 570
End
Ferrari
Ford
Man
Close the Catalogue
OUTPUT
Type: Car
Model: Ferrari
Color: red
Horsepower: 550
Type: Car
Model: Ford
Color: green
Horsepower: 120
Type: Truck
Model: Man
Color: red
Horsepower: 200
Cars have average horsepower of: 413.33.
Trucks have average horsepower of: 250.00.

INPUT
car Opel green 736
End
Close the Catalogue
OUTPUT
Cars have average horsepower of: 736.00.
Trucks have average horsepower of: 0.00.

*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicles> vehiclesList =new ArrayList<>();

        String command = scanner.nextLine();
        while(!command.equals("End")){
            String type = command.split(" ")[0];
            String model = command.split(" ")[1];
            String color = command.split(" ")[2];
            int hp = Integer.parseInt(command.split(" ")[3]);
            Vehicles v1 = new Vehicles(type,model,color,hp);
            vehiclesList.add(v1);
            command = scanner.nextLine();
        }
        String closing = scanner.nextLine();
        while(!closing.equals("Close the Catalogue")){
            for (Vehicles vehicle : vehiclesList){
                if (vehicle.getModel().equals(closing)){
                    if (vehicle.getType().equals("car")) System.out.println("Type: Car");
                    if (vehicle.getType().equals("truck")) System.out.println("Type: Truck");
                    System.out.println("Model: "+vehicle.getModel());
                    System.out.println("Color: "+vehicle.getColor());
                    System.out.println("Horsepower: "+vehicle.getHorsepower());
                }
            }
            closing = scanner.nextLine();
        }
        double avarageCarHp = 0, avarageTruckHp=0;
        int counterCar=0, counterTruck=0;
        for (Vehicles vh : vehiclesList){
            if (vh.getType().equals("car")){
                avarageCarHp+=vh.getHorsepower();
                counterCar++;
            } else {
                avarageTruckHp+=vh.getHorsepower();
                counterTruck++;
            }
        }
        if (counterCar==0) counterCar=1;
        if (counterTruck==0) counterTruck=1;
        System.out.printf("Cars have average horsepower of: %.2f.\n",avarageCarHp/counterCar);
        System.out.printf("Trucks have average horsepower of: %.2f.",avarageTruckHp/counterTruck);
    }
}
