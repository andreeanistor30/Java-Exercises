package isp.lab4.exercise4;
import org.junit.Test;

import junit.framework.Assert;
public class ControlerTest {
    @Test
   public void testToString(){
    FireAlarm a=new FireAlarm(false);
       Assert.assertEquals("Should display FireAlarm{alarm=false}","FireAlarm{alarm=false}",a.toString());
    }
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
    
}
