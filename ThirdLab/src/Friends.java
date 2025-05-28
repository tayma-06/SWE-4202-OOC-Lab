public class Friends {
    private String name;
    private int age;
    private String address;

    public Friends(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }

    public void learn() {
        System.out.println(getName() + " is learning.");
    }

    public void display() {
        System.out.println("Information of " + getName() + " :");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Address : " + getAddress());
    }
}