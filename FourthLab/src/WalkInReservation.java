// Subclass of Reservation
public class WalkInReservation extends Reservation {

    // Constructor
    public WalkInReservation(String guestName) {
        super(guestName);
    }

    // Overriding Method
    @Override
    public void bookRoom() {
        System.out.println("Booking room via walk-in reservation.");
    }

    // Overriding Method
    @Override
    public void bookRoom(String guestName, boolean isVIP) {
        if (isVIP) {
            System.out.println("Booking a VIP room room for " + getGuestName() + " via walk-in.");
        } else {
            System.out.println("Booking a standard room for " + getGuestName() + " via walk-in.");
        }
    }

}
