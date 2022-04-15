package isp.lab6.exercise3;

import junit.framework.Assert;
import org.junit.Test;

public class SensorTest {

    @Test
    public void testToString() {
        Sensor s = new Sensor("2", SensorType.HUMIDITY);
        Assert.assertEquals("Should display Sensor{id=2, type=HUMIDITY, readings=[]}", "Sensor{id=2, type=HUMIDITY, readings=[]}", s.toString());
    }

    @Test
    public void testAddSensorReadings() {
        SensorReading sensor1 = new SensorReading(1.2, 102302);
        SensorReading sensor2 = new SensorReading(2, 1075);
        Sensor s = new Sensor("1", SensorType.PRESSURE);
        s.addSensorReading(sensor2);
        s.addSensorReading(sensor1);
        Assert.assertEquals("Should display Sensor{id=1, type=PRESSURE, readings=[SensorReading{value=2.0, dateAndTime=1075}, SensorReading{value=1.2, dateAndTime=102302}]}", "Sensor{id=1, type=PRESSURE, readings=[SensorReading{value=2.0, dateAndTime=1075}, SensorReading{value=1.2, dateAndTime=102302}]}", s.toString());

    }
}
