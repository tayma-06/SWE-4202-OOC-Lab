public class Cat extends Animal {
    public Cat(String name) {
        super(name, "Indoor/Outdoor");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Habitat : " + getHabitat());
    }
}
