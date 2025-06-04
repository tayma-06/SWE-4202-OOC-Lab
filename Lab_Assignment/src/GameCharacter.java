// This class is a blueprint for the characters of the game "Legends of Aetherfall"

public abstract class GameCharacter {
    // The attributes of all the characters are same
    private String name;
    private int health;
    private int power;
    private int standardAttackDamage;
    private int standardAttackPowerCost;

    public GameCharacter(String name, int health, int power, int standardAttackDamage, int standardAttackPowerCost) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.standardAttackDamage = standardAttackDamage;
        this.standardAttackPowerCost = standardAttackPowerCost;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getStandardAttackDamage() {
        return standardAttackDamage;
    }

    public int getStandardAttackPowerCost() {
        return standardAttackPowerCost;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStandardAttackDamage(int standardAttackDamage) {
        this.standardAttackDamage = standardAttackDamage;
    }

    public void setStandardAttackPowerCost(int standardAttackPowerCost) {
        this.standardAttackPowerCost = standardAttackPowerCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(GameCharacter opponent) {
        if (getPower() >= getStandardAttackPowerCost()) {
            System.out.println(getName() + " used attack on " + opponent.getName());
            System.out.println(getName() + " caused " + getStandardAttackDamage() + " damage.");
            opponent.setHealth(opponent.getHealth() - getStandardAttackDamage());
            setPower(getPower() - getStandardAttackPowerCost());
        } else {
            System.out.println("Not enough Power");
        }
    }

    public abstract void special(GameCharacter opponent);

}
