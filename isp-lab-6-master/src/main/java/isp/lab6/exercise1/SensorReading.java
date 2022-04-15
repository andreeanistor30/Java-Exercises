package isp.lab6.exercise1;

public class SensorReading implements Comparable<SensorReading> {

    private int value;
    private String location;
    private Type type;

    public SensorReading() {
    }

    public SensorReading(int value, String location, Type type) {
        this.value = value;
        this.location = location;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(SensorReading obj) {
        if (this.value > obj.value) {
            return 1;
        } else if (this.value < obj.value) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "SensorReading{" + "value=" + value + ", location=" + location + ", type=" + type + '}';
    }

}
