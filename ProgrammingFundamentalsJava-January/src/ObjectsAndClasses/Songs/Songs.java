package ObjectsAndClasses.Songs;
public class Songs {
    private String type;
    private String name;
    private String time;

    public Songs(String type, String name, String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
