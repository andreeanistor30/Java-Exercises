/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess.file;

import isp.lab8.carparkaccess.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParkingAccessFileControl{

    private String working_folder="C:\\EntryCars";
    private String working_folder1="C:\\HistoryParking";
    private  int UNIT_PRICE = 1;
    
    public void carEntry(Car car) {
        try {
            SerializableUtil.writeVehicle(car, working_folder+"\\"+"car_"+car.getPlateNumber()+".dat");
            car.setEntryTime((System.currentTimeMillis()));
        } catch (IOException ex) {
            Logger.getLogger(ParkingAccessFileControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int carExit(String plateNumber) {
        try{
          //get all files in working folder
          List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);
          for(String f: files){
              //get vehicle and look for plate number
              System.out.println("Search "+f);
              Car v = (Car)SerializableUtil.readVehicle(working_folder+"\\"+f);
             // System.out.println(v.getNumberOfExits());
              if(v.getPlateNumber().equals(plateNumber)){
                  //if plate number found calculate price, remove vehicle and return price
                  System.out.println("Vehicle is exiting car park.");
                  v.increaseNumberOfExits();
                  FileOutputStream file = new FileOutputStream(working_folder1 + "\\"+"car_"+plateNumber+"_"+v.getNumberOfExits()+".dat");
                  ObjectOutputStream out = new ObjectOutputStream(file);
                  out.writeObject(v);
                  long stay = (System.currentTimeMillis() - v.getEntryTime())/1000;
                  FilesAndFoldersUtil.deleteFile(working_folder+"\\car_"+plateNumber+".dat");
                 System.out.println(stay);
                  return (int)(stay * UNIT_PRICE);
              }             
          }
          
        }catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public void viewCurrentCars()  {
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);
       for (String f : files) {
                try {
                    f = working_folder + "\\" + f;
                    FileInputStream file = new FileInputStream(f);
                    ObjectInputStream in = new ObjectInputStream(file);
                    Car object = (Car) in.readObject();
                    long time=System.currentTimeMillis() - object.getEntryTime();
                    System.out.println(object+", currentCost="+time/1000);
                    in.close();
                    file.close();
                } catch (IOException ex) {
                    System.out.println("IOException is caught");
                     ex.printStackTrace();
                }catch(ClassNotFoundException e){
                    System.out.println("ClassNotFound is caught");
                     e.printStackTrace();
                }
                
    }
    }

    public void viewPastEntriesForCar(String plateNumber) {
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder1);
        for (String f : files) {
                try {
                    f = working_folder1 + "\\" + f;
                    System.out.println(f);
                    FileInputStream file = new FileInputStream(f);
                    ObjectInputStream in = new ObjectInputStream(file);
                    Car object = (Car) in.readObject();
                    if(object.getPlateNumber().equals(plateNumber))System.out.println(object.getPlateNumber()+object.getEntryTime()+" "+object.getTotalStay()+" "+object.getTotalStay()*UNIT_PRICE);
                    long time=System.currentTimeMillis() - object.getEntryTime();
                    in.close();
                    file.close();
                } catch (IOException ex) {
                    System.out.println("IOException is caught");
                     ex.printStackTrace();
                }catch(ClassNotFoundException e){
                    System.out.println("ClassNotFound is caught");
                     e.printStackTrace();
                }
                
    }
    }

    public void viewPastUniqueEntries(String plateNumber) {
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder1);
        Set <Car> s= new HashSet <Car>();
        for (String f : files) {
                try {
                    f = working_folder1 + "\\" + f;
                    FileInputStream file = new FileInputStream(f);
                    ObjectInputStream in = new ObjectInputStream(file);
                    Car object = (Car) in.readObject();
                    if(s.add(object))System.out.println(object);
                    long time=System.currentTimeMillis() - object.getEntryTime();
                    System.out.println(object+", currentCost="+time/1000);
                    in.close();
                    file.close();
                } catch (IOException ex) {
                    System.out.println("IOException is caught");
                }catch(ClassNotFoundException e){
                    System.out.println("ClassNotFound is caught");
                     e.printStackTrace();
                }
                
    }
    }

  
    
}
