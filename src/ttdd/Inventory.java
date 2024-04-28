
package ttdd;

import java.util.ArrayList;
import java.util.List;


public class Inventory {
   private List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        System.out.println("Inventory Items:");
        for (Item item : items) {
            System.out.println(item.getItemName() + " - Price: $" + item.getPrice());
        }
    }
}
