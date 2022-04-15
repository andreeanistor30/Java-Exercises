package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.ParkingAccessFileControl;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import junit.framework.Assert;
import org.junit.Test;

public class CarParkingAccessAppTest {

    @Test
    public void testCarEntry() {
        ParkingAccessFileControl f = new ParkingAccessFileControl();
        String working_folder="C:\\EntryCars";
        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
        f.carEntry(c2);
        try {
            FileInputStream file = new FileInputStream(working_folder);
            ObjectInputStream in = new ObjectInputStream(file);
            Car object = (Car) in.readObject();
            Assert.assertEquals("Should display CJ-02-AAA","CJ-02-AAA",object.getPlateNumber());
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound is caught");
        }

    }
    @Test
    public void testCarExitIfTheCarExist(){
        ParkingAccessFileControl f = new ParkingAccessFileControl();
        String working_folder1="C:\\HistoryParking";
        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
        f.carEntry(c2);
        f.carExit("CJ-02-AAA");
        try {
            FileInputStream file = new FileInputStream(working_folder1);
            ObjectInputStream in = new ObjectInputStream(file);
            Car object = (Car) in.readObject();
            Assert.assertEquals("Should display CJ-02-AAA","CJ-02-AAA",object.getPlateNumber());
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound is caught");
        }
    }
    @Test
    public void testCarExitIfTheCarDoesNotExist(){
        ParkingAccessFileControl f = new ParkingAccessFileControl();
        String working_folder1="C:\\HistoryParking";
        try {
            FileInputStream file = new FileInputStream(working_folder1);
            ObjectInputStream in = new ObjectInputStream(file);
            Car object = (Car) in.readObject();
            Assert.assertEquals("Should display -1",-1,f.carExit("CJ-02-AAA"));
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound is caught");
        }
    }
}
