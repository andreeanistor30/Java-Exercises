package isp.lab4.exercise2;
import org.junit.Test;

import junit.framework.Assert;
public class FireAlarmTest {
   @Test
   public void testToString(){
       FireAlarm a=new FireAlarm(false);
       Assert.assertEquals("Should display FireAlarm{alarm=false}","FireAlarm{alarm=false}",a.toString());
    }
}
