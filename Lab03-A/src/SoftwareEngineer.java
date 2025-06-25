public class SoftwareEngineer extends Friends {
    private String profession;
    private Positions position;

    public SoftwareEngineer(String name, int age, String address, Positions position) {
        super(name, age, address);
        this.profession = "Software Engineer";
        this.position = position;
    }

    public String getProfession() {
        return profession;
    }

    public Positions getPosition() {
        return position;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning software engineering.");
    }

    public void solveCodingTask() {
        System.out.println(getName() + " is performing his coding task.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Profession : " + getProfession());
        System.out.println("Position : " + getPosition());
    }

}
