package isp.lab3.exercise6;

import java.util.*;

public class VendingMachine {
    private int credit;
    private Product[] products;
    private int numberOfProducts;
    private static VendingMachine object=new VendingMachine(0);
    private  VendingMachine(int credit) {
        this.credit = credit;
        products = new Product[10];
    }
    public static VendingMachine getObject()
    {
        return object;
    }
    public void add(Product product) {
        products[numberOfProducts++] = product;
    }

    public void displayProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i]);
        }
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int Id) {

        for (int i = 0; i < numberOfProducts; i++) {
            if (Id == products[i].getSelectionId()) {
                return products[i].getName();
            }
        }
        return "The product was not found";

    }

    public int getCredit() {
        return credit;
    }

    public void displayCredit() {
        System.out.println(credit);
    }

    public void userMenu() {
        System.out.println("Hi!Insert the ID of one the following items:");
        displayProducts();
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println(selectProduct(id));
        if (selectProduct(id).equals("The product was not found")==false) {
            System.out.println("Introduce the amount of money:");
            int sum = sc.nextInt();
            insertCoin(sum);
            System.out.println("Thank you!");
        }

    }
}
