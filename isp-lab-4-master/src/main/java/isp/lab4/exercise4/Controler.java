package isp.lab4.exercise4;

public class Controler {

    private TemperatureSensor[] temperatureSensors;
    private FireAlarm fireSensor;

    public Controler(TemperatureSensor[] temperatureSensors, FireAlarm fireSensor) {
        this.temperatureSensors = temperatureSensors;
        this.fireSensor = fireSensor;
    }

    public void controlStep() {
        boolean ok = true;
        for (int i = 0; i < temperatureSensors.length; i++) {
            if (this.temperatureSensors[i].getValue() <= 50) {
                ok = false;
            }
        }
        if (ok == true) {
            System.out.println("Fire alarm started");
            fireSensor.setActive();
        } else {
            System.out.println("Fire alarm not started");
        }

    }

}
