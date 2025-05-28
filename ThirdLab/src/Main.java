public class Main {
    public static void main(String[] args) {
        System.out.println();
        SoftwareEngineer s1 = new SoftwareEngineer("Rayan", 23, "Dhaka", Positions.JUNIORDEVELOPER);
        s1.display();
        s1.eat();
        s1.learn();
        System.out.println();
        Dancer d1 = new Dancer("Tahsin", 23, "Dhaka", "Elite Group of Choturongo Shilpokola Academy");
        d1.display();
        d1.learn();
        System.out.println();
        Singer si1 = new Singer("Anika", 23, "Dhaka", "Guitar", "Imaginary Band", Role.LEAD_VOCALIST);
        si1.display();
        si1.learn();
    }
}
