package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorReadingList implements IReadingRepository {

    ArrayList<SensorReading> array = new ArrayList<SensorReading>();

    @Override
    public void addReading(SensorReading reading) {
        array.add(reading);
    }

    @Override
    public double getAvarageValueByType(Type type, String location) {
        int sum = 0, numberOfElements = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLocation() == location && array.get(i).getType() == type) {
                sum += array.get(i).getValue();
                numberOfElements++;
            }
        }
        return (double) sum / numberOfElements;
    }

    public List<SensorReading> getReadingsByType(Type type) {
        ArrayList<SensorReading> array2 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getType() == type) {
                array2.add(array.get(i));
            }
        }
        return array2;
    }

    public void listSortedByLocation() {
        Collections.sort(array, new Comparator<SensorReading>() {
            @Override
            public int compare(SensorReading obj1, SensorReading obj2) {
                return obj1.getLocation().compareTo(obj2.getLocation());
            }
        });
    }

    public void listSortedByValue() {
        Collections.sort(array);
    }

    public List<SensorReading> findAllByLocationAndType(String location, Type type) {
        ArrayList<SensorReading> array2 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getType() == type && array.get(i).getLocation() == location) {
                array2.add(array.get(i));
            }
        }
        return array2;
    }

    public void display() {
        for (SensorReading sensorReading : array) {
            System.out.println(sensorReading);
        }
    }
}
