// Subclass of Reservation
public class OnlineReservation extends Reservation {

    // Constructor
    public OnlineReservation(String guestName) {
        super(guestName);
    }

    // Overriding Method
    @Override
    public void bookRoom() {
        System.out.println("Booking room through online reservation system.");
    }

    // Overriding Method
    @Override
    public void bookRoom(String guestName) {
        System.out.println("Booking for guest " + getGuestName() + " via online system.");
    }

    // Overriding Method
    @Override
    public void bookRoom(String guestName, boolean isVIP) {
        if (isVIP) {
            System.out.println("Booking a VIP room room for " + getGuestName() + " via online.");
        } else {
            System.out.println("Booking a standard room for " + getGuestName() + " via online.");
        }
    }
}
