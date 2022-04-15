package isp.lab3.exercise6;

public class Exercise6 {

    public static void main(String arg[]) {
        Product p = new Product("Milka", 12);
        Product p1 = new Product("7Days", 7);
        Product p2 = new Product("Coca-Cola", 5);
        VendingMachine object = VendingMachine.getObject();
        object.add(p);
        object.add(p1);
        object.add(p2);
        object.userMenu();
    }
}
