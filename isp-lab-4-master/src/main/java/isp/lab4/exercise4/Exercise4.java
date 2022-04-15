package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args){
    FireAlarm fireAlarm1=new FireAlarm(false);
    TemperatureSensor temperatureSensor1=new TemperatureSensor(20,"Cluj-Napoca");
    TemperatureSensor temperatureSensor2=new TemperatureSensor(51,"Outside");
    TemperatureSensor temperatureSensor3=new TemperatureSensor(12,"Paris");
    TemperatureSensor[] temperatureSensors = {temperatureSensor1, temperatureSensor2, temperatureSensor3};
    Controler controler=new Controler(temperatureSensors,fireAlarm1);
    controler.controlStep();
    System.out.println(temperatureSensor1);
}
}