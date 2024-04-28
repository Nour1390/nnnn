
package ttdd;


public class custmer {
    private String name;
    private double nationalID;
    private double age;
    private double phonenumber;

    public custmer(String name, double nationalID, double age, double phonenumber) {
        this.name = name;
        this.nationalID=nationalID;
          if (age > 15) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Must be 16 or older.");
        }   
        
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public double getNationalID() {
        return nationalID;
    }
    
}
