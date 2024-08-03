package DefiningClasses.CarSaleman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
@CIHAN GUR

Define two classes Car and Engine. A Car has a model, engine, weight, and color. An Engine has a model, power,
 displacement, and efficiency. A Car's weight, color, Engine displacements, and efficiency are optional.
On the first line, you will read a number N which will specify how many lines of engines you will receive, on
 each of the next N lines, you will receive information about an Engine in the following format
 "{Model} {Power} {Displacement} {Efficiency}". After the lines with engines, on the next line,
 you will receive a number M – specifying the number of Cars that will follow, on each of the next
 M lines the information about a Car will follow in the following format "{Model} {Engine} {Weight} {Color}",
  where the engine in the format will be the model of an existing Engine. When creating the object for a Car,
  you should keep a reference to the real engine in it, instead of just the engine's model, note that the optional
  properties might be missing from the formats.
Your task is to print each car (in the order you received them) and its information in the format defined below.
If any of the optional fields have not been given, print "n/a" in its place instead of:
"{CarModel}:{EngineModel}:Power: {EnginePower}Displacement: {EngineDisplacement}Efficiency: {EngineEfficiency}Weight:
{CarWeight}Color: {CarColor}"
Optional
Override the class ToString() methods to have a reusable way of displaying the objects.

>>>>>INPUT
2
V8-101 220 50
V4-33 140 28 B
3
FordFocus V4-33 1300 Silver
FordMustang V8-101
VolkswagenGolf V4-33 Orange
>>>>>OUTPUT
FordFocus:
V4-33:
Power: 140
Displacement: 28
Efficiency: B
Weight: 1300
Color: Silver
FordMustang:
V8-101:
Power: 220
Displacement: 50
Efficiency: n/a
Weight: n/a
Color: n/a
VolkswagenGolf:
V4-33:
Power: 140
Displacement: 28
Efficiency: B
Weight: n/a
Color: Orange

>>>>>INPUT
4
DSL-10 280 B
V7-55 200 35
DSL-13 305 55 A+
V7-54 190 30 D
4
FordMondeo DSL-13 Purple
VolkswagenPolo V7-54 1200 Yellow
VolkswagenPassat DSL-10 1375 Blue
FordFusion DSL-13
>>>>>OUTPUT
FordMondeo:
DSL-13:
Power: 305
Displacement: 55
Efficiency: A+
Weight: n/a
Color: Purple
VolkswagenPolo:
V7-54:
Power: 190
Displacement: 30
Efficiency: D
Weight: 1200
Color: Yellow
VolkswagenPassat:
DSL-10:
Power: 280
Displacement: n/a
Efficiency: B
Weight: 1375
Color: Blue
FordFusion:
DSL-13:
Power: 305
Displacement: 55
Efficiency: A+
Weight: n/a
Color: n/a
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> enginesList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String engineInfo = scanner.nextLine();
            String[] engineDate = engineInfo.split(" ");
            //v4-33 140 28 B
            String model = engineDate[0];
            String power = engineDate[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            if (engineDate.length == 4) {
                displacement = engineDate[2];
                efficiency = engineDate[3];
            } else if (engineDate.length == 3) {
                if(Character.isDigit(engineDate[2].charAt(0))){
                    displacement = engineDate[2];
                } else {
                    efficiency = engineDate[2];
                }
            }
            Engine engine = new Engine(model,power,displacement,efficiency);
            enginesList.add(engine);

        }
        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String carInfo = scanner.nextLine();
            String[] carData = carInfo.split(" ");
            String carModel = carData[0];
            String engineModel = carData[1];
            String carWeight = "n/a";
            String carColor = "n/a";
            if (carData.length == 4) {
                carWeight = carData[2];
                carColor = carData[3];
            } else if (carData.length == 3) {
                if(Character.isDigit(carData[2].charAt(0))){
                    carWeight = carData[2];
                } else {
                    carColor = carData[2];
                }
            }
            Engine theEngine = getEngineByModel(enginesList, engineModel);
            Car car = new Car (carModel,theEngine,carWeight,carColor);
            carsList.add(car);
        }

        carsList.forEach(car -> System.out.println(car.toString()));

    }

    private static Engine getEngineByModel(List<Engine> enginesList, String engineModel) {
        for (Engine engine : enginesList) {
            if (engine.getModel().equals(engineModel)) {
                return engine;
            }
        }
        return null;
    }
}
