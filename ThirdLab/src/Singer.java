public class Singer extends Friends {
    private String profession;
    private String instrument;
    private String band;
    private String position;

    public Singer(String name, int age, String address, String instrument, String band, String position) {
        super(name, age, address);
        this.profession = "Singer";
        this.instrument = instrument;
        this.band = band;
        this.position = position;
    }

    public String getProfession() {
        return profession;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getBand() {
        return band;
    }

    public String getPosition() {
        return position;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning dance");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Profession : " + getProfession());
        System.out.println("Likes to play as an Instrument : " + getInstrument());
        System.out.println("Band name : " + getBand());
        System.out.println("Position : " + getPosition());
    }
}
