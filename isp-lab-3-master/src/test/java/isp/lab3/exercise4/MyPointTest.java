
package isp.lab3.exercise4;


import junit.framework.Assert;
import org.junit.Test;

public class MyPointTest {
    @Test
    public void testDistance(){
        MyPoint p1=new MyPoint();
        Assert.assertEquals("The value should be 5",5.0,p1.distance(4, 3, 0));
        
    }
    @Test
    public void testDistance2(){
        MyPoint p1=new MyPoint();
        MyPoint p2=new MyPoint(4,3,0);
        Assert.assertEquals("The value should be 5",5.0,p1.distance(p2));
    }
    
}
