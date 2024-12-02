public class Item {
    private String name;
    private Double price = 9.99;
    private Integer quantity = 1;

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public Item setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Item setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
