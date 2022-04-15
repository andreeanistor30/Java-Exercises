/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.FilesAndFoldersUtil;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author mihai.hulea
 */
public class ParkingAccessControl {

    public static final int MAX_CAPACITY = 5;
    public static final int PRICE = 1;

    private ArrayList<Car> parkedCars = new ArrayList<>();
    private ArrayList<Car> previousCars = new ArrayList<>();

    public ParkingAccessControl() {
        String working_folder = "C:\\EntryCars";
        try {
            //get all files in working folder
            List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);
            for (int i = 0; i < files.size(); i++) {
                System.out.println(files.get(i));
            }
            for (String f : files) {
                try {
                    f = working_folder + "\\" + f;
                    FileInputStream file = new FileInputStream(f);
                    ObjectInputStream in = new ObjectInputStream(file);
                    Car object = (Car) in.readObject();
                    parkedCars.add(object);
                    in.close();
                    file.close();
                } catch (IOException ex) {
                    System.out.println("IOException is caught");
                     ex.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }

        

    public void carEntry(Car car) {
        //1. sa verific capacitatea 
        //2. daca capacitatea este depasita -> return 
        //3. verific daca nu cumva masina este deja in parcare, si daca este -> return 
        //4. daca masina nu este in parcare salvez obiectul de tip car in parkedCars 
        if (parkedCars.size() <= MAX_CAPACITY) {
            for (int i = 1; i <= parkedCars.size(); i++) {
                if (car.getPlateNumber().equals(parkedCars.get(i).getPlateNumber())) {
                    return;
                } else {
                    parkedCars.add(car);
                    car.setEntryTime((System.currentTimeMillis()) / 1000);
                }
            }
        } else {
            return;
        }
        System.out.println("Car " + car + " is entering car park!");
    }

    public int carExit(String plateNumber) throws ClassNotFoundException {
        //1. cautam dupa plate number un Car in parkedCars
        //2. daca nu am gasit plateNumber -> return 
        //3. daca am gasit masina, 
        //calculez timpul de asteptare in parcare, -> System.currentTimeMiliseconds()
        //calculez pretul, 
        //sterg masina din parkedCars si o adaug in previousCars
        //returnez pretul
        System.out.println(plateNumber);
        boolean found = false;
        int index=0;
        for (int i = 0; i < parkedCars.size(); i++) {
            if (parkedCars.get(i).getPlateNumber().equals(plateNumber)) {
                index=i;
                System.out.print(index+parkedCars.get(i).getPlateNumber());
                found = true;
            }
        }
        if (found == false) {
            return 0;
        } else {
           
            previousCars.add(parkedCars.get(index));
            
             try {
                    String working_folder1="C:\\HistoryParking";
                    String f = working_folder1 + "\\"+"car_"+parkedCars.get(index).getPlateNumber()+".dat";
                    FileOutputStream file = new FileOutputStream(f);
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(f);
                    out.close();
                    file.close();
                } catch (IOException ex) {
                    System.out.println("IOException is caught");
                     ex.printStackTrace();
                }
             long currentTime = ((System.currentTimeMillis()) / 1000)-parkedCars.get(index).getEntryTime();
            int price = (int) (currentTime * PRICE);
            parkedCars.remove(index);
            for(int i=0;i<parkedCars.size();i++)
                System.out.println(parkedCars.get(i));
            
            return price;
        }

    }

    public void viewCurrentCars() {
        for (int i = 0; i < parkedCars.size(); i++) {
            System.out.println(parkedCars.get(i));
        }
    }

    public void viewPastEntriesForCar(String plateNumber) {
        for (int i = 0; i < previousCars.size(); i++) {
            System.out.println(previousCars.get(i));
        }
    }

    public void viewPastUniqueEntries() {
        int numberOfEntries = 0;
        Car car = new Car();
        for (int i = 0; i < previousCars.size() - 1; i++) {
            numberOfEntries = 0;
            for (int j = i + 1; j < previousCars.size(); j++) {
                if (previousCars.get(i) == previousCars.get(j)) {
                    numberOfEntries++;
                    car = previousCars.get(i);

                }
            }
            if (numberOfEntries == 1) {
                System.out.println(car);
            }
        }
    }

    @Override
    public String toString() {
        return "ParkingAccessControl{" + "parkedCars=" + parkedCars + ", previousCars=" + previousCars + '}';
    }

}
