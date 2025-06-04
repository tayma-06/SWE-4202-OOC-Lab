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

    public void quickSort(GameCharacter opponent) {
        System.out.println(getName() + " used Quick Shot on " + opponent.getName());
        System.out.println(getName() + " caused 30 damage.");
        opponent.setHealth(opponent.getHealth() - 30);
        setPower(getPower() - 25);
    }

    public void multiShot(GameCharacter opponent) {
        System.out.println(getName() + " used Multi Shot on " + opponent.getName());
        System.out.println(getName() + " caused 60 damage.");
        opponent.setHealth(opponent.getHealth() - 60);
        setPower(getPower() - 50);
    }

    @Override
    public void special(GameCharacter opponent) {
        if (getPower() >= 50) {
            multiShot(opponent);
        } else if (getPower() >= 25) {
            quickSort(opponent);
        } else {
            System.out.println("Insufficient Power.");
        }
    }
}