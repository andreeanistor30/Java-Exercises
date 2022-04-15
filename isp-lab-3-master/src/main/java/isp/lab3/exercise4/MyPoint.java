package isp.lab3.exercise4;

import java.lang.Math;

public class MyPoint {

    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "(" + x + " ," + y + " ," + z + ')';
    }

    public double distance(int x, int y, int z) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) + (this.z - z) * (this.z - z));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y) + (this.z - another.z) * (this.z - another.z));
    }

}
