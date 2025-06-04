// Protagonist Character Class
// Archers, swift and silent, trained in forest warfare and beast communion
// They have a balanced health and damagecapacity. They can shoot a single or multiple arrows at a time. 
// Multiple arrows will damage the enemy twice
// Health: 100
// Power: 100
// Standard Attack Damage: 15
// Standard Attack power cost: 8
// Special Move: quickShot()– PowerCost(Special): 25 – Special Effect: Deals 30 health damage to opponent
// Special Move: multiShot()– PowerCost(Special): 50 – Special Effect: Deals 60 health damage to opponent

public class Archer extends GameCharacter {
    public Archer(String name) {
        super(name, 100, 100, 15, 8);
    }

    @Override
    public void useSpecialMove(GameCharacter opponent) {

    }
}
