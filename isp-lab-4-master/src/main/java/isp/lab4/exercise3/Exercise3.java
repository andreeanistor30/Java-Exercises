package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        FireAlarm fireAlarm=new FireAlarm(false);
        TemperatureSensor temperature=new TemperatureSensor(61,"Cluj-Napoca");
        Controler c=new Controler(temperature,fireAlarm);
        c.controlStep();
        
    }
}
