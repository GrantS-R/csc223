package Module4.ProgrammingAssignment.Problem1;

public class Item implements Comparable<Item>{
    private String name;
    private int quantity;
    private double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setName(String name) throws RuntimeException {
        if (name == null || name.length() == 0) {
            throw new RuntimeException("null or empty String value is not allowed.");
        }
        if (name.length() > 50) {
            name = name.substring(0, 50);
        }
        this.name = name;
    }

    public void setQuantity(int quantity) {
        if (quantity > 100 || quantity < 1) {
            quantity = 1;
        }
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0 || unitPrice > 1000) {
            unitPrice = 0.99;
        }
        this.unitPrice = unitPrice;
    }

    public int compareTo(Item item) {
        return name.toLowerCase().compareTo(item.getName().toLowerCase());
    }

    public double subtotal() {
        return unitPrice * quantity;
    }

    public String toString() {
        return String.format("%-50s%-5d$%.2f",name,quantity, quantity*unitPrice);
    }
}
