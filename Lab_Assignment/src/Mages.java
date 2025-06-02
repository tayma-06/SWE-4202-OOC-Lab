// Protagonist Character Class
//  Mages,scholars of the arcane who harness elemental and spiritual energies
// They have the lowest health, comparatively, but have the highest damage potential
// They can cast spells on the enemy, which will unleash the highest damage to any enemy
// Health: 80
// Power: 100
// Standard Attack Damage: 20
// Standard Attack power cost: 10
// Special Move: castSpell()- PowerCost(Special): 30 - Special Effect: Deals 40 health damage to opponent

public class Mages extends GameCharacter {
    public Mages() {
        super(80, 100, 20, 10);
    }

}
