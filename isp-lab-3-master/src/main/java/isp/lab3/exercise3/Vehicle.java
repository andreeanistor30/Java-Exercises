package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {

    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int numberObject;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        numberObject++;
    }

    public Vehicle() {
        numberObject++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return model + " (" + type + ") speed " + speed + " fuel type " + fuelType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.model);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + this.speed;
        hash = 17 * hash + this.fuelType;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.speed != other.speed) {
            return false;
        }
        if (this.fuelType != other.fuelType) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }
    public static void displayNumberObject(){
        System.out.println("The number of objects is: "+numberObject);
    }

}
