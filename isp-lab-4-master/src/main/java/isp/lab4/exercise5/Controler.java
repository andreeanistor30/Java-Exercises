package isp.lab4.exercise5;

public class Controler {

    private TemperatureSensor[] temperatureSensors;
    private FireAlarm fireSensor;
    private FireAlarm fire;
    private TemperatureSensor temperature;

    public Controler() {
        fire = new FireAlarm();
        temperature = new TemperatureSensor();
        fireSensor =new FireAlarm();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor(51,"Outside");
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(12,"Cluj-Napoca");
        TemperatureSensor temperatureSensor3 = new TemperatureSensor(5,"Alba-Iulia");
        temperatureSensors = new TemperatureSensor[]{temperatureSensor1,temperatureSensor2,temperatureSensor3};
    }

    public void controlStep() {
        boolean ok = true;
        for (int i = 0; i < temperatureSensors.length; i++) {
            if (this.temperatureSensors[i].getValue() > 50) {
                ok = false;
            }
        }
        if (ok == false) {
            System.out.println("Fire alarm started");
            fireSensor.setActive();
        } else {
            System.out.println("Fire alarm not started");
        }

    }
}
