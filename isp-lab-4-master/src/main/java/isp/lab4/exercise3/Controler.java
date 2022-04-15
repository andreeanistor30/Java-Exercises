package isp.lab4.exercise3;

public class Controler {

    private TemperatureSensor temperatureSensor;
    private FireAlarm firealarm;

    public Controler(TemperatureSensor temperatureSensor, FireAlarm firealarm) {
        this.temperatureSensor = temperatureSensor;
        this.firealarm = firealarm;
    }

    
    public void controlStep() {
        if(this.temperatureSensor.getValue() > 50)firealarm.setActive();
        if(this.firealarm.isActive()==true)System.out.println("Fire alarm started");
        else System.out.println("Fire alarm not started");
        
        
    }
}
