package Model.Character.CharacterClasses;

import Model.Character.Character;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Archer extends Character {

    public Archer(String name) {
        this.name = name;
        this.maxHealthPoints = 125;
        this.healthPoints = maxHealthPoints;
        this.strength = 10;
        this.dexterity = 20;
        this.defense = 5;
        this.intelligence = 15;
    }


    @Override
    protected int getAttackPower() {
        return this.dexterity;
    }
}
