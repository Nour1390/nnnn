
package ttdd;

import java.util.Date;

public class Hotel {

   
    public static void main(String[] args) {
  
      custmer cc=new custmer("mohamed", 5454545, 22, 555);
      custmer c2=new custmer("Mohamed ahmed", 747474, 20, 545);
      
    
        // Create rooms
        Room room101 = new Room(101, roomType.DOUBLE);
        Room room102 = new Room(102, roomType.SINGLE);

        // Create staff members
        Receptionist receptionist = new Receptionist("Ahmed zeyad", "R001");
        HouseKeeping housekeeper = new HouseKeeping("Eman fahmi", "H001");
        Servant servant = new Servant("Nour mohamed", "S001");
        Manager manager = new Manager("Marwan amir", "M001");

        // Create inventory
        Inventory inventory = new Inventory();

        // Add items to inventory
        Item coffee = new Item("Coffee", 2.5, 205, "drinks");
        Item tea = new Item("Tea", 1.5,206,"drinks");
        inventory.addItem(coffee);
        inventory.addItem(tea);

        // Display inventory
        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        // Create reservations
        Date checkInDate = new Date();
        Date checkOutDate = new Date(checkInDate.getTime() + 3 * 24 * 60 * 60 * 1000); // Add 3 days
        Reservation reservation1 = new Reservation(cc,1, checkInDate, checkOutDate, room101);
        Reservation reservation2 = new Reservation(c2,2, checkInDate, checkOutDate, room102);
        System.out.println(reservation2.getCheckInDate());
        System.out.println(reservation2.getCheckOutDate());
                

        // Perform check-in and duties
        receptionist.checkInGuest(reservation1);
        housekeeper.cleanRoom(room101);
        manager.hireEmployee(receptionist);

        // Display updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        // Perform additional actions
        servant.takeOrder(coffee);
        servant.deliverOrder(coffee);

        // Display final check-out
        manager.dismissEmployee(receptionist);
        System.out.println("\nGuests checked out. Room status:");
        System.out.println("Room 101 is booked: " + room101.isBooked());
        System.out.println("Room 102 is booked: " + room102.isBooked());
        
        
        
        
        bill pp=new bill(room102, reservation2,servant);
        
    }
}

        
        
        
    
    

