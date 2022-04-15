package isp.lab6.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        final Equipment firstEquipment = new Equipment("HP", "1745");
        System.out.println(firstEquipment.isTaken());
        System.out.println(firstEquipment.getOwner());
        final Equipment secondEquipment = new Equipment("HP", "1745", "Andreea");
        System.out.println(secondEquipment.isTaken());
        System.out.println(secondEquipment.getOwner());
    }
}
