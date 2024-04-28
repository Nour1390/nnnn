
package ttdd;


public class Servant extends Staff  {
     private double servantCost;
    
    
    public Servant(String name, String employeeId) {
        super(name, employeeId);
    }

      @Override
    public void performDuties() {
        System.out.println("Servant: Serving guests...");
    }
     public void takeOrder(Item item) {
        System.out.println("Servant " + getName() + " taking order: " + item.getItemName());
        servantCost=servantCost+item.getPrice();
        
    }

    public void deliverOrder(Item item) {
        System.out.println("Servant " + getName() + " delivering Order: " + item.getItemName());
    }

    public double getServantCost() {
        return servantCost;
    }

    
    
    
}
