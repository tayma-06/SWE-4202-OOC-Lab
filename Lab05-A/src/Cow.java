public class Cow extends Animal {
    public Cow(String name) {
        super(name, "Farm");
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Habitat : " + getHabitat());
    }
}
