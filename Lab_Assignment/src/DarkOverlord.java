// Antagonist Character Class
// Once a wise mage,Kael’tharon gave himself to forbidden magic and became a creature of fire and shadow
// Now, he spreads darkness across Aetherfall
// He causes great damage by this and damages both power and health. Additionally, he can weaken the next attack
// Health: 200
// Power: 150
// Standard Attack Damage: 25
// Standard Attack Power Cost: 17
// Special Move: summonDarkness()- PowerCost(Special): 40 - Special Effect: Deals 50 health damage to opponent and will weaken the affect of the next attack by half

public class DarkOverlord extends GameCharacter {
    public DarkOverlord() {
        super("DarkOverlord", 200, 150, 25, 17);
    }

    public void summonDarkness(GameCharacter opponent) { // special effect for summoning darkness
        System.out.println(getName() + " Summoned Darkness on " + opponent.getName());
        System.out.println(getName() + " caused 50 damage.");
        opponent.setHealth(opponent.getHealth() - 50);
        setPower(getPower() - 40);
    }

    public void special(GameCharacter opponent) {
        if (getPower() >= 40) {
            summonDarkness(opponent);
            opponent.setWeaken(1);
        } else {
            attack(opponent);
        }
    }
}