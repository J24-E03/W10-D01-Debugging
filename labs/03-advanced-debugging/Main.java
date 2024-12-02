public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.addItem(null);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        Item item = (new Item())
                .setName("Pencil")
                .setPrice(1.5)
                .setQuantity(2)
        ;
        sale.addItem(item);
    }
}
