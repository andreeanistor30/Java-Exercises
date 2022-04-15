package isp.lab3.exercise4;

public class Exercise4 {

    public static void main(String args[]) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(1, 2, 3);
        System.out.println("The distance between the point p1 and the point p2 is equal with " + p1.distance(p2));
        System.out.println("The distance between the point p1 and the point (1,2,3) is equal with " + p1.distance(3, 4, 0));
    }
}
