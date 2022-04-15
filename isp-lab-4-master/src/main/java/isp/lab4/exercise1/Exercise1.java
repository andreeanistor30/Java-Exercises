package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor temperature=new TemperatureSensor(1,"Cluj-Napoca");
        System.out.println(temperature.toString());
        TemperatureSensor temperature1=new TemperatureSensor(5,"Paris");
        System.out.println(temperature1.getLocation());
        System.out.println(temperature1.getValue());
        
    }
}
