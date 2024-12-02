package src;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        // try to add a null item
        Item newItem = null;
        sale.addItem(newItem);

        // try to add more items than the array's length
        Item[] newItems = new Item[11];
        for(int i = 0; i <= 10; i++) {
            newItems[i] = new Item((10.0 + 10*i) , (i), "Item".concat(Integer.toString(i)));
            sale.addItem(newItems[i]);
        }
    }
}