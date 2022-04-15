package isp.lab3.exercise3;

public class Exercise3 {

    public static void main(String args[]) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.setModel("Dacia");
        v1.setType("Logan");
        v1.setSpeed(150);
        v1.setFuelType('B');
        v2.setModel("Volkswagen");
        v2.setType("Golf");
        v2.setSpeed(220);
        v2.setFuelType('B');
        System.out.println(v1);
        System.out.println(v2);
        if (v1.equals(v2)) {
            System.out.println("The objects is equals");
        } else {
            System.out.println("The object is not equals");
        }
        Vehicle.displayNumberObject();

    }
}
