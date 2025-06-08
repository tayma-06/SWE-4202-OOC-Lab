// Protagonist Character Class
// Warriors, resilient and fearless, wielding enchanted steel and the honor of ancient lineages
// They have the highest health among all factions
// They can shield themselves  from anyattack, but the shield will work only if the enemy has less health power than the warrior
// Health: 120
// Power: 100
// Standard Attack Damage: 12
// Standard Attack power cost: 5
// Special Move: mightyStrike()- PowerCost(Special): 35 - Special Effect: Deals 35 health damage to opponent

public class Warrior extends GameCharacter {
    private boolean shield = false;

    public Warrior(String name) {
        super(name, 120, 100, 12, 5);
    }

    public void mightyStrike(GameCharacter opponent) { // special effect for mighty strike
        int damage = 35;
        damage = calculateDamage(damage);
        System.out.println(getName() + " used Mighty Strike on " + opponent.getName());
        System.out.println(getName() + " caused " + damage + " damage.");
        opponent.setHealth(opponent.getHealth() - damage);
        setPower(getPower() - 35);
    }

    public void special(GameCharacter opponent) {
        if (getPower() >= 35) {
            mightyStrike(opponent);
        } else {
            System.out.println("Insufficient Power.");
        }
        shield(opponent);
    }

    public void shield(GameCharacter opponent) { // shield effect for the warrior
        if (getHealth() > opponent.getHealth()) {
            shield = true;
            System.out.println(getName() + " activated Shield!");
        }
    }

    @Override
    public void attack(GameCharacter opponent) {
        super.attack(opponent);
        shield(opponent);
    }

    public void setHealth(int health) {
        if (shield) {
            System.out.println(getName() + "'s Shield blocked the attack!");
            shield = false;
        } else {
            super.setHealth(health);
        }
    }
}