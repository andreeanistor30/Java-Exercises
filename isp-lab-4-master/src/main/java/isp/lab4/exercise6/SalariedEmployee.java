package isp.lab4.exercise6;


public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String firstName, String lastName) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }


    
    @Override
    public double getPaymentAmount(){
        return weeklySalary;
    }
    
}
