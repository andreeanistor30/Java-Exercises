package isp.lab4.exercise5;
import org.junit.Test;

import junit.framework.Assert;
public class HouseTest {
    @Test
    public void testIsActive(){
      
        FireAlarm fire = new FireAlarm();
        fire.setActive();
      Assert.assertEquals("Method should display true",true,fire.isActive());
    }
    @Test
    public void testToString(){
        TemperatureSensor temperature=new TemperatureSensor(6,"Oradea");
        Assert.assertEquals("Method should display TemperatureSensor{value=6, location=Oradea}","TemperatureSensor{value=6, location=Oradea}",temperature.toString());
    }
}
