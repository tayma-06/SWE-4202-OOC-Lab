// Antagonist Character Class
// Once a wise mage,Kael’tharon gave himself to forbidden magic and became a creature of fire and shadow
// Now, he spreads darkness across Aetherfall
// He causes great damage by this and damages both power and health. Additionally, he can weaken the next 3 attack
// Health: 200
// Power: 150
// Standard Attack Damage: 25
// Standard Attack Power Cost: 17
// Special Move: summonDarkness()- PowerCost(Special): 40 - Special Effect: Deals 50 health damage to opponent and will weakenthe affect of the next attack by half

public class DarkOverlord extends GameCharacter {
    public DarkOverlord() {
        super("DarkOverlord", 200, 150, 25, 17);
    }

    @Override
    public void useSpecialMove(GameCharacter opponent) {

    }
}
