package isp.lab4.exercise6;
import org.junit.Test;

import junit.framework.Assert;
public class EmployeeTest {
    @Test
    public void testGetPaymentAmount1(){
         ComissionEmployee comissionEmployee=new ComissionEmployee(2000,260.59,"Ann","William");
         Assert.assertEquals("Should display 1739.41",1739.41,comissionEmployee.getPaymentAmount());
    }
    public void testGetPaymentAmount2(){
         HourlyEmployee hourlyEmployee=new HourlyEmployee(300,1.5,"John","Smith");
         Assert.assertEquals("Should display 450",450,hourlyEmployee.getPaymentAmount());
    }
    public void testGetPaymentAmount3(){
        SalariedEmployee salariedEmployee=new SalariedEmployee(400,"Nancy","Francis");
         Assert.assertEquals("Should display 400",400,salariedEmployee.getPaymentAmount());
    }
      public void testGetPaymentAmount4(){
        Employee employee=new Employee("Nancy","Francis");
         Assert.assertEquals("Should display 0",0,employee.getPaymentAmount());
    }
}
