// This class is a blueprint for the characters of the game "Legends of Aetherfall"

public class GameCharacter {
    // The attributes of all the characters are same
    private int health;
    private int power;
    private int standardAttackDamage;
    private int standardAttackPowerCost;

    public GameCharacter(int health, int power, int standardAttackDamage, int standardAttackPowerCost) {
        this.health = health;
        this.power = power;
        this.standardAttackDamage = standardAttackDamage;
        this.standardAttackPowerCost = standardAttackPowerCost;
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

}
