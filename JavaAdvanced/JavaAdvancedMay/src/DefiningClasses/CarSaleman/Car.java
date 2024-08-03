package DefiningClasses.CarSaleman;

public class Car{
    //A Car has a model, engine, weight, and color.
    private String model;
    private String weight;
    private String color;
    private Engine engine;

    public Car(String model, Engine engine, String weight, String color){
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.engine = engine;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(this.model + ":").append(System.lineSeparator());
        sb.append(this.engine.toString()).append(System.lineSeparator());
        sb.append("Weight: "+this.weight).append(System.lineSeparator());
        sb.append("Color: "+this.color);
        return sb.toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
