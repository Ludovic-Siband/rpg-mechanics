package Model.Character.CharacterClasses;

import Model.Character.Character;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Warrior extends Character {

    public Warrior(String name) {
        this.name = name;
        this.maxHealthPoints = 115;
        this.healthPoints = this.maxHealthPoints;
        this.strength = 20;
        this.dexterity = 5;
        this.defense = 10;
        this.intelligence = 5;
    }

    @Override
    protected int getAttackPower() {
        return this.strength;
    }
}
