public class Animal {
    private String name;
    private String habitat;

    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Habitat : " + habitat);
    }
}
