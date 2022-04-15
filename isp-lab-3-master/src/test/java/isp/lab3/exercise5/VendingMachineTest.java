package isp.lab3.exercise5;
import junit.framework.Assert;
import org.junit.Test;
public class VendingMachineTest {
    @Test
    public void testInsertCoin(){
        VendingMachine v1=new VendingMachine(0);
        v1.insertCoin(2);
        Assert.assertEquals("Value should be 2",2 ,v1.getCredit());
    }
    @Test
    public void testSelectProduct(){
        Product p1=new Product("Coca-Cola",12);
        VendingMachine v1=new VendingMachine(0);
        v1.add(p1);
        Assert.assertEquals("Value should be Coca-Cola","Coca-Cola" ,v1.selectProduct(12));
        Assert.assertEquals("Value should be Coca-Cola","The product was not found" ,v1.selectProduct(19));
    }
}
