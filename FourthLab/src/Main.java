public class Main {
    public static void main(String[] args) {
        // Polymorphism
        Reservation g1 = new WalkInReservation("Amanda");
        g1.bookRoom();
        g1.bookRoom(g1.getGuestName()); // this method was not in subclass WalkInReservation
        g1.bookRoom(g1.getGuestName(), true);
        System.out.println();

        OnlineReservation g2 = new OnlineReservation("Kiara");
        g2.bookRoom();
        g2.bookRoom(g2.getGuestName());
        g2.bookRoom(g2.getGuestName(), true);
        System.out.println();

        WalkInReservation g3 = new WalkInReservation("Sofia");
        g3.bookRoom();
        g3.bookRoom(g3.getGuestName(), true);
    }
}
