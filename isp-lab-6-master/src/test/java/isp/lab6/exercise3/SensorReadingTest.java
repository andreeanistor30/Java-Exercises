package isp.lab6.exercise3;

import junit.framework.Assert;
import org.junit.Test;


public class SensorReadingTest {
@Test
    public void testCompareTo() {
        SensorReading sensor1 = new SensorReading(1.2, 102302);
        SensorReading sensor2 = new SensorReading(2, 1075);        
        Assert.assertEquals("Should display 1",1, sensor1.compareTo(sensor2));
    }
    
}
