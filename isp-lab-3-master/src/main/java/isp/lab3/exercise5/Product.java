package isp.lab3.exercise5;

public class Product {
    private String name;
    private int selectionId;

    public Product(String name, int selectionId) {
        this.name = name;
        this.selectionId = selectionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", selectionId=" + selectionId + '}';
    }
    
}
