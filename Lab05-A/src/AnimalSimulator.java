import java.util.ArrayList;

public class AnimalSimulator {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal dog = new Dog("Hank");
        animals.add(dog);
        Animal cat = new Cat("Leo");
        animals.add(cat);
        Animal cow = new Cow("Bambi");
        animals.add(cow);
        System.out.println("Animal Information: ");
        for (Animal animal : animals) {
            animal.displayInfo();
        }
        System.out.println();
        System.out.println("Animal Behaviors: ");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
