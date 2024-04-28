
package ttdd;

import java.util.Date;


public class Receptionist extends Staff {
     public Receptionist(String name, String employeeId) {
        super(name, employeeId);
    }

     @Override
    public void performDuties() {
        System.out.println("Receptionist " + getName() + ": Welcome to our hotel!");
    }

    
    /*  public void createReservation(Room room, Date checkInDate, Date checkOutDate, int reservationId) {
        Reservation reservation = new Reservation(reservationId, checkInDate, checkOutDate, room);
        System.out.println("Reservation created for Room " + room.getRoomNumber());
        room.bookRoom();
    }*/
      
      
        public void checkInGuest(Reservation reservation) {
        if (reservation != null) {
            Date currentDate = new Date();
            if (currentDate.after(reservation.getCheckInDate())) {
                System.out.println("Guest checked in successfully.");
                // Additional logic for checking in the guest
            } else {
                System.out.println("Cannot check in guest before check-in date.");
            }
        } else {
            System.out.println("Invalid reservation.");
        }
    }
          public void cancelReservation(Reservation reservation) {
        if (reservation != null) {
            System.out.println("Reservation cancelled for guest.");
            reservation.getRoom().unbookRoom();
            // Additional logic for cancelling the reservation
        } else {
            System.out.println("Invalid reservation.");
        }
    }
     
        
}
