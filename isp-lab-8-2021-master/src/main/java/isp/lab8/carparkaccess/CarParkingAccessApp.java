package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.Car;
import isp.lab8.carparkaccess.ParkingAccessControl;
import isp.lab8.carparkaccess.file.ParkingAccessFileControl;
import java.util.concurrent.TimeUnit;

public class CarParkingAccessApp {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        
        ParkingAccessFileControl fpac = new ParkingAccessFileControl();
        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
        Car c3 = new Car("CJ-02-BBB", System.currentTimeMillis());
        Car c4 = new Car("CJ-02-CCC", System.currentTimeMillis());
        fpac.carEntry(c2);
        fpac.carEntry(c3);
        fpac.carEntry(c4);
        fpac.viewCurrentCars();

        int price = fpac.carExit("CJ-02-BBB");
        fpac.viewCurrentCars();
        Car c6 = new Car("CJ-02-ABC", System.currentTimeMillis());
        int price2 = fpac.carExit("CJ-02-ABC");
        System.out.println("Price to be payed = " + price);
        fpac.viewPastEntriesForCar("CJ-02-BBB");

    }
}
