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
    public Warrior(String name) {
        super(name, 120, 100, 12, 5);
    }

    @Override
    public void useSpecialMove(GameCharacter opponent) {
        if (getPower() >= 35) {
            System.out.println(getName() + " used Mighty Strike on " + opponent.getName());
            System.out.println(getName() + " caused 35 damage.");
            opponent.setHealth(opponent.getHealth() - 35);
            setPower(getPower() - 35);
        } else {
            System.out.println("Insufficient Power.");
        }
    }
}