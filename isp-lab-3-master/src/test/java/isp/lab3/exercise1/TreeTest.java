package isp.lab3.exercise1;

import junit.framework.Assert;
import org.junit.Test;

public class TreeTest {
    @Test
    public void testGrow()
    {
        Tree t1=new Tree();
        t1.grow(2);
        Assert.assertEquals("Value should be 17",17 ,t1.getHeight());
    }
    @Test
    public void testToString()
    {
     Tree t1=new Tree();
     t1.grow(1);
     Assert.assertEquals("Value should be '16'","16",t1.toString());
    }
}
