public class Dog extends Animal {
    public Dog(String name) {
        super(name, "Domestic");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Habitat : " + getHabitat());
    }

}
