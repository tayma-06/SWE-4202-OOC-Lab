public class Dancer extends Friends {
    private String profession;
    private String academy;

    public Dancer(String name, int age, String address, String academy) {
        super(name, age, address);
        this.profession = "Dancer";
        this.academy = academy;
    }

    public String getProfession() {
        return profession;
    }

    public String getAcademy() {
        return academy;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning dance.");
    }

    public void dance() {
        System.out.println(getName() + " dances in different festivals as a member of " + academy + ".");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Profession : " + getProfession());
        System.out.println("Academy : " + getAcademy());
    }
}
