// Abstract Class
public abstract class Reservation implements VIP {
    private String guestName;

    // Constructor
    public Reservation(String guestName) {
        this.guestName = guestName;
    }

    // Getter
    public String getGuestName() {
        return guestName;
    }

    // Setter
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Abstract Method
    public abstract void bookRoom();

    // Overloading Method
    public void bookRoom(String guestName) {
        System.out.println("Booking a standard room for " + guestName);
    }

    // Interface method + Overloading Method
    public void bookRoom(String guestName, boolean isVIP) {
        if (isVIP) {
            System.out.println("Booking a VIP room room for " + guestName);
        } else {
            System.out.println("Booking a standard room for " + guestName);
        }
    }

}
