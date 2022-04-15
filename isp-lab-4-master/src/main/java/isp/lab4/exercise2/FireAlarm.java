package isp.lab4.exercise2;

public class FireAlarm {

    private boolean alarm;

    public FireAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public void setActive() {
        this.alarm=true;
    }

    public boolean isActive() {
        return this.alarm == true;
    }

    @Override
    public String toString() {
        return "FireAlarm{" + "alarm=" + alarm + '}';
    }
    

}
