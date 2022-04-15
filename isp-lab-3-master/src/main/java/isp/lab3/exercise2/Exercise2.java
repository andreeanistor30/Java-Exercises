package isp.lab3.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3, "Red");
        System.out.println("The object have a length of " + r.getLength() + ", a width of " + r.getWidth() + " and " + r.getColor() + " color");
        System.out.println("The area of the rectangle is " + r.getArea() + " and the perimeter is " + r.getPerimeter());

    }
}
