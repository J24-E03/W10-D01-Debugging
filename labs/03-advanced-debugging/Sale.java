/*
1. Open the provided Java program in an IDE with debugging capabilities, such as IntelliJ IDEA or Eclipse.
2. Start debugging mode and set a breakpoint at the line where the program adds an item to a sale by clicking on the line number in the source code.
3. Step through the program until the bug occurs. In this case, we get a NullPointerException when trying to add an item to a sale.
4. Use the debugger to inspect the values of relevant variables and determine the cause of the bug. We can see that the items array in the Sale class is not initialized, causing a NullPointerException when trying to add an item to it.
5. Fix the bug by initializing the items array in the Sale constructor and test the system to ensure that items can now be added to a sale.
*/

import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String item = scanner.next();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        Sale sale = new Sale();
        sale.addItem(new Item(item, price, quantity));
    }
  
    private Item[] items;
    private int itemCount;
    private double total;

    public Sale() {
        items = new Item[10];
        itemCount = 0;
        total = 0;
    }

    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
        total += item.getPrice() * item.getQuantity();
        System.out.println("Item added successfully.");
        System.out.println("Sale total: " + total);
    }

    static class Item{
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
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
}

