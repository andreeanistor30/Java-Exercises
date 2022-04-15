package isp.lab4.exercise5;

public class FireAlarm {

    private boolean alarm;

    public FireAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public void setActive() {
        this.alarm = true;
    }

    public boolean isActive() {
        return this.alarm == true;
    }

    public FireAlarm() {
    }

    @Override
    public String toString() {
        return "FireAlarm{" + "alarm=" + alarm + '}';
    }
}
