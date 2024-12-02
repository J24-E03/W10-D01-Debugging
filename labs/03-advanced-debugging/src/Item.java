package src;
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(double price, int quantity, String name) {
        setPrice(price);
        setQuantity(quantity);
        setName(name);
    }

    private void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Invalid item name.");
            this.name = "Unknown";
            return;
        }
        this.name = name;
    }

    private void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity!");
            this.quantity = 0;
            return;
        }
        this.quantity = quantity;
    }

    private void setPrice(double price) {
        if (price < 0){
            System.out.println("Invalid price!");
            this.price = 10.0; // default value
            return;
        }
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
