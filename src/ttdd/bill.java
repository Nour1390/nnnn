
package ttdd;


public class bill {
   
    private double time;
    private double price;
    
    
    public bill(Room room , Reservation rr , Servant ss){
    time=rr.getCheckOutDate().getDate()- rr.getCheckInDate().getDate();
    
    
     switch (room.getRoomType()) {
            case SINGLE:
                price = 100.0*time; // Example price for Single room
                break;
            case DOUBLE:
                price = 200.0*time; // Example price for Double room
                break;
            case EXECUTIVE:
                price = 300.0*time; // Example price for Executive room
                break;
            case ROYAL:
                price = 1000.0*time; // Example price for Royal room
                break;
        }
    
    price = price + ss.getServantCost();
    
        System.out.println("Your bill is: $" + price);
    }
}
