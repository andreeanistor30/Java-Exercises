package isp.lab6.exercise3;

import java.util.List;
import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {
        SensorReading sensor1 = new SensorReading(2.5, 1023);
        SensorReading sensor2 = new SensorReading(1, 1075);
        SensorReading sensor3 = new SensorReading(3, 1075);
        System.out.println(sensor1.compareTo(sensor2));
        System.out.println(sensor2.compareTo(sensor3));
        Sensor s = new Sensor("5", SensorType.TEMPERATURE);
        s.addSensorReading(sensor1);
        s.addSensorReading(sensor2);
        s.addSensorReading(sensor3);
        System.out.println(s);

    }
}
