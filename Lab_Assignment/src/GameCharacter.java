// This class is a blueprint for the characters of the game "Legends of Aetherfall"

public abstract class GameCharacter {
    // The attributes of all the characters are same
    private String name;
    private int health;
    private int power;
    private int standardAttackDamage;
    private int standardAttackPowerCost;
    private int weaken = 0; // special effect Dark Overlord

    public GameCharacter(String name, int health, int power, int standardAttackDamage, int standardAttackPowerCost) { // Constructor
        this.name = name;
        this.health = health;
        this.power = power;
        this.standardAttackDamage = standardAttackDamage;
        this.standardAttackPowerCost = standardAttackPowerCost;
    }

    public String getName() { // getter setter methods - Encapsulation
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

    public int getWeaken() {
        return weaken;
    }

    public void setWeaken(int weaken) {
        this.weaken = weaken;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int calculateDamage(int damage) { // calculates the damage - Dark Overlord special effect
        if (weaken > 0) {
            damage /= 2;
            weaken--;
            System.out.println(name + "'s attack was weakened!");
        }
        return damage;
    }

    public void attack(GameCharacter opponent) { // attack method : mechanics for attacking the opponent
        if (power >= standardAttackPowerCost) {
            int damage = standardAttackDamage;
            damage = calculateDamage(damage);
            System.out.println(name + " used attack on " + opponent.getName());
            System.out.println(name + " caused " + damage + " damage.");
            opponent.setHealth(opponent.getHealth() - damage);
            power -= standardAttackPowerCost;
        } else {
            System.out.println("Not enough Power");
        }
    }

    public abstract void special(GameCharacter opponent);
}