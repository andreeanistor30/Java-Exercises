package isp.lab6.exercise1;

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println("Test implementation here.");
        SensorReading sensor = new SensorReading(10, "Cluj-Napoca", Type.TEMPERATURE);
        SensorReading sensor1 = new SensorReading(15, "Alba-Iulia", Type.TEMPERATURE);
        SensorReading sensor2 = new SensorReading(13, "Cluj-Napoca", Type.HUMIDITY);
        SensorReadingList s = new SensorReadingList();
        s.addReading(sensor1);
        s.addReading(sensor);
        s.addReading(sensor2);
        System.out.println(s.getAvarageValueByType(Type.TEMPERATURE, "Cluj-Napoca"));
        s.listSortedByLocation();
        s.display();
        s.listSortedByValue();
        s.display();

    }
}
