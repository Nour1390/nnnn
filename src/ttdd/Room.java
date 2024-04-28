
package ttdd;


public class Room {
    private int roomNumber;
    private boolean isBooked;
    private roomType roomType;

    public Room(int roomNumber, roomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isBooked=false;
    }

    public roomType getRoomType() {
        return roomType;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        isBooked = true;
    }

    public void unbookRoom() {
        isBooked = false;
    }

   
}
