// Antagonist Character Class
// These powerful leaders each control a part of Aetherfall
// Their magic is strong, their goals are twisted, and they rule over regions soaked in corruption.
// They canstopopponentattacks for a certain time.
// Health: 130
// Power: 110
// Standard Attack Damage: 20
// Standard Attack power cost: 10
// Special Move: toxicAura()- PowerCost(Special): 35 - Special Effect: Deals 30 health damage and next 20 seconds the user cannot attack

public class RegionalWarlord extends GameCharacter {
    public RegionalWarlord() {
        super("RegionalWarLord", 130, 110, 20, 10);
    }
}
