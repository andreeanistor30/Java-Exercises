package isp.lab4.exercise1;
import org.junit.Test;

import junit.framework.Assert;
public class TemperatureSensorTest {
    //implement minimal tests
    @Test
    public void testGetValue()
    {
        TemperatureSensor t=new TemperatureSensor(1,"Cluj-Napoca");
       Assert.assertEquals("Should display 1", 1,t.getValue() );
    }
     @Test
    public void testGetLocation()
    {
        TemperatureSensor t=new TemperatureSensor(1,"Cluj-Napoca");
       Assert.assertEquals("Should display Cluj-Napoca","Cluj-Napoca",t.getLocation());
    }
    @Test
    public void testToString(){
       TemperatureSensor t=new TemperatureSensor(1,"Cluj-Napoca");
       Assert.assertEquals("Should display TemperatureSensor{value=1, location=Cluj-Napoca}","TemperatureSensor{value=1, location=Cluj-Napoca}",t.toString());
    }
    
}
