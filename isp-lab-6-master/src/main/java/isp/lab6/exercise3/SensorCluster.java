package isp.lab6.exercise3;

import java.util.ArrayList;

public class SensorCluster {

    ArrayList<Sensor> arrayWithSensors;

    public SensorCluster() {
        arrayWithSensors = new ArrayList<Sensor>();
    }

    public Sensor addSensor(String id, SensorType type) {
        Sensor sensor = new Sensor(id, type);
        boolean check = true;
        for (int i = 0; i < arrayWithSensors.size(); i++) {
            System.out.println(arrayWithSensors.get(i));
            if (arrayWithSensors.get(i).getId() == id) {
                check = false;
            }
        }
        if (check == true) {
            arrayWithSensors.add(sensor);
            return sensor;
        } else {
            return null;
        }
    }

    public boolean writeSensorReading(String id, double value, long dtaeTime) {
        for(int i=0;i<arrayWithSensors.size();i++)
            if(arrayWithSensors.get(i).getId()==id)
            {
                SensorReading sensor1= new SensorReading(value,dtaeTime);
                arrayWithSensors.get(i).addSensorReading(sensor1);
                return true;
            }
        return false;
    }

    public Sensor getSensorById(String id) {
        for (int i = 0; i < arrayWithSensors.size(); i++) {
            if (arrayWithSensors.get(i).getId() == id) {
                return arrayWithSensors.get(i);
            }
        }
        return null;

    }

    @Override
    public String toString() {
        return "SensorCluster{" + "arrayWithSensors=" + arrayWithSensors + '}';
    }

}
