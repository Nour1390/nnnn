
package ttdd;


abstract class Staff {
     private String name;
    private String employeeId;

    public Staff(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public abstract void performDuties();
}
