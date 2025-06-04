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

    @Override
    public void useSpecialMove(GameCharacter opponent) {

    }
}
