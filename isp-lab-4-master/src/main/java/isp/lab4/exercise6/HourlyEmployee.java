package isp.lab4.exercise6;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours, String firstName, String lastName) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }


@Override
    public double getPaymentAmount() {
        return wage*hours;
    }
}
