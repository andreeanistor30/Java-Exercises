package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String args[]){
        ComissionEmployee comissionEmployee=new ComissionEmployee(1700.99,270.99,"Marie","Lue");
        ComissionEmployee comissionEmployee1=new ComissionEmployee(2000,300.99,"Marie","Alan");
        HourlyEmployee hourlyEmployee=new HourlyEmployee(170,2.5,"John","Smith");
        HourlyEmployee hourlyEmployee1=new HourlyEmployee(200,3,"Cristian","Brown");
        SalariedEmployee salariedEmployee=new SalariedEmployee(350,"Nancy","Francis");
        SalariedEmployee salariedEmployee1=new SalariedEmployee(230,"Jordan","Johnson");
        System.out.println("The first employee payment amount: "+comissionEmployee.getPaymentAmount());
        System.out.println("The second employee payment amount: "+hourlyEmployee.getPaymentAmount());
        System.out.println("The third employee payment amount: "+salariedEmployee.getPaymentAmount());
        
        Employee [] employee={comissionEmployee,comissionEmployee1,hourlyEmployee,hourlyEmployee1,salariedEmployee,salariedEmployee1};
        double totalPayment=0;
        for(int i=0;i<employee.length;i++)
        {
            totalPayment=totalPayment+(employee[i]).getPaymentAmount();
        }
        System.out.println("Total payment is "+totalPayment);
    }
}
