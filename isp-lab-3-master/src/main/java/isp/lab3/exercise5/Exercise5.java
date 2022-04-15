package isp.lab3.exercise5;

public class Exercise5 {
    public static void main(String[] args){
    VendingMachine vendingMachine=new VendingMachine(0);
    Product p=new Product("Milka",12);
    Product p1=new Product("7Days",7);
    Product p2=new Product("Coca-Cola",5);
    vendingMachine.add(p);
    vendingMachine.add(p1);
    vendingMachine.add(p2);
    vendingMachine.userMenu();
    }
    
}
