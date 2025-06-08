// Protagonist Character Class
// Mages,scholars of the arcane who harness elemental and spiritual energies
// They have the lowest health, comparatively, but have the highest damage potential
// They can cast spells on the enemy, which will unleash the highest damage to any enemy
// Health: 80
// Power: 100
// Standard Attack Damage: 20
// Standard Attack power cost: 10
// Special Move: castSpell()- PowerCost(Special): 30 - Special Effect: Deals 40 health damage to opponent

public class Mage extends GameCharacter {

    public Mage(String name) {
        super(name, 80, 100, 20, 10);
    }

    public void castSpell(GameCharacter opponent) {
        int damage = 40;
        damage = calculateDamage(damage);
        System.out.println(getName() + " casted spell on " + opponent.getName());
        System.out.println(getName() + " caused " + damage + " damage.");
        opponent.setHealth(opponent.getHealth() - damage);
        setPower(getPower() - 30);
    }

    @Override
    public void special(GameCharacter opponent) { // special effect is casting spell
        if (getPower() >= 30) {
            castSpell(opponent);
        } else {
            System.out.println("Insufficient Power.");
        }
    }
}