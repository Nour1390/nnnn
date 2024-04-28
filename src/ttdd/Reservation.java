
package ttdd;

import java.util.Date;

public class Reservation {

   private int reservationId;
    private Date checkInDate;
    private Date checkOutDate;
    private Room room;
    private custmer custmer;

    public Reservation( custmer custmer ,int reservationId, Date checkInDate, Date checkOutDate, Room room) {
        this.custmer=custmer;
        this.reservationId = reservationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.room = room;
         System.out.println("Reservation created for Room " + room.getRoomNumber());
        room.bookRoom();
    }

    public int getReservationId() {
        return reservationId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public custmer getCustmer() {
        return custmer;
    }
        
        
}
