package isp.lab6.exercise3;

public class SensorReading implements Comparable<SensorReading> {

    double value;
    long dateAndTime;

    public SensorReading(double value, long dateAndTime) {
        this.value = value;
        this.dateAndTime = dateAndTime;
    }

    public SensorReading() {
    }

    public double getValue() {
        return value;
    }

    @Override
    public int compareTo(SensorReading o) {
        if (this.dateAndTime > o.dateAndTime) {
            return 1;
        } else if (this.dateAndTime == o.dateAndTime) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "SensorReading{" + "value=" + value + ", dateAndTime=" + dateAndTime + '}';
    }

}
