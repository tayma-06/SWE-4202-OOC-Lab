// Antagonist Character Class
// Some mortals have joined the enemy willingly, choosing power over honor
// They fight with cursed weapons, wear blackened armor, and often lead raids in villages and resistance camps
// They can harm any character’s health but will not affect power
// Health: 90
// Power: 90
// Standard Attack Damage: 18
// Standard Attack power cost: 9
// Special Move: curse()- PowerCost(Special): 20 - Special Effect: Deals 25 health damage

public class CorruptedMortal extends GameCharacter {
    public CorruptedMortal() {
        super("CorruptedMortal", 90, 90, 18, 9);
    }

    public void curse(GameCharacter opponent) { // special effect for cursing
        System.out.println(getName() + " cursed " + opponent.getName());
        System.out.println(getName() + " caused 25 damage.");
        opponent.setHealth(opponent.getHealth() - 25);
        setPower(getPower() - 20);
    }

    public void special(GameCharacter opponent) {
        if (getPower() >= 20) {
            curse(opponent);
        } else {
            attack(opponent);
        }
    }
}