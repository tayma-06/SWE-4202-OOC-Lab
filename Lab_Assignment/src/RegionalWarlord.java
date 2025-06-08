// Antagonist Character Class
// These powerful leaders each control a part of Aetherfall
// Their magic is strong, their goals are twisted, and they rule over regions soaked in corruption.
// They canstopopponentattacks for a certain time.
// Health: 130
// Power: 110
// Standard Attack Damage: 20
// Standard Attack power cost: 10
// Special Move: toxicAura()- PowerCost(Special): 35 - Special Effect: Deals 30 health damage and next 20 seconds the user cannot attack

import java.util.Random;

public class RegionalWarlord extends GameCharacter {
    Random random = new Random();

    public RegionalWarlord() {
        super("RegionalWarLord", 130, 110, 20, 10);
    }

    public void toxicAura(GameCharacter opponent) { // special effect for using toxic aura
        System.out.println(getName() + " used Toxic Aura on " + opponent.getName());
        System.out.println(getName() + " caused 30 damage.");
        opponent.setHealth(opponent.getHealth() - 30);
        setPower(getPower() - 35);
        System.out.println("Cannot attack for next 20 seconds.");
        long startTime = System.currentTimeMillis();
        long duration = 20 * 1000; // 20 seconds in milliseconds
        while (System.currentTimeMillis() - startTime < duration) {

        }
    }

    public void special(GameCharacter opponent) {
        if (getPower() >= 35) {
            toxicAura(opponent);
        } else {
            attack(opponent);
        }
    }
}