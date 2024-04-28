
package ttdd;


public class Item {
    private String itemName;
    private double price;
    private int Id;
    private String category;

    
    public Item(String itemName, double price, int Id, String category) {
        this.itemName = itemName;
        this.price = price;
        this.Id = Id;
        this.category = category;
    }
    

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return Id;
    }

    public String getCategory() {
        return category;
    }
    
    
}
