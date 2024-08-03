package DefiningClasses.CarSaleman;

public class Engine {
    //Engine has a model, power, displacement, and efficiency
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;

    }
    public String toString () {
        StringBuilder engineString = new StringBuilder();
        engineString.append(this.model + ":").append(System.lineSeparator());
        engineString.append("Power: "+this.power).append(System.lineSeparator());
        engineString.append("Displacement: "+this.displacement).append(System.lineSeparator());
        engineString.append("Efficiency: "+this.efficiency);
        return engineString.toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

}
