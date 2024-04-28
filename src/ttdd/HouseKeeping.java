
package ttdd;


public class HouseKeeping extends Staff{
       public HouseKeeping(String name, String employeeId) {
        super(name, employeeId);
    }

       @Override
    public void performDuties() {
        System.out.println("Housekeeper: Cleaning room...");
    }
     public void cleanRoom(Room room) {
        System.out.println("Housekeeper " + getName() + " cleaning Room " + room.getRoomNumber());
    }

    public void reportMaintenanceIssue(String issue) {
        System.out.println("Housekeeper " + getName() + " reporting maintenance issue: " + issue);
    }
}
