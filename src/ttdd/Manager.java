
package ttdd;


public class Manager extends Staff{
     public Manager(String name, String employeeId) {
        super(name, employeeId);
    }

     @Override
   public void performDuties() {
        System.out.println("Manager " + getName() + ": Managing the hotel operations...");
    }

    public void hireEmployee(Staff staff) {
        System.out.println("Manager " + getName() + ": Hiring " + staff.getName());
    }

    public void dismissEmployee(Staff staff) {
        System.out.println("Manager " + getName() + ": Dismissing " + staff.getName());
    }
}
