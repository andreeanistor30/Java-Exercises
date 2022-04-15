package isp.lab6.exercise3;

import java.util.*;

public class Sensor {

    private String id;
    private SensorType type;
    ArrayList<SensorReading> readings;

    public Sensor() {
        readings = new ArrayList<SensorReading>();
    }

    public Sensor(String id, SensorType type) {
        this.id = id;
        this.type = type;
        readings = new ArrayList<SensorReading>();
    }

    public Sensor(String id, SensorType type, ArrayList<SensorReading> readings) {
        this.id = id;
        this.type = type;
        this.readings = readings;
        readings = new ArrayList<SensorReading>();
    }

    public ArrayList<SensorReading> getReadings() {
        return readings;
    }

    public String getId() {
        return id;
    }

    public void addSensorReading(SensorReading reading) {
        readings.add(reading);
    }

    List<SensorReading> getSensorReadingSortedByValue() {
        Collections.sort(readings, new Comparator<SensorReading>() {
            @Override
            public int compare(SensorReading obj1, SensorReading obj2) {
                int c = (int) (obj1.getValue() - obj2.getValue());
                return c;
            }
        });
        return readings;
    }

    @Override
    public String toString() {
        return "Sensor{" + "id=" + id + ", type=" + type + ", readings=" + readings + '}';
    }

}
