package Model.Character.CharacterClasses;

import Model.Character.Character;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Wizard extends Character {


    public Wizard(String name) {
        this.name = name;
        this.maxHealthPoints = 100;
        this.healthPoints = this.maxHealthPoints;
        this.strength = 5;
        this.dexterity = 10;
        this.defense = 15;
        this.intelligence = 20;
    }

    @Override
    protected int getAttackPower() {
        return this.intelligence;
    }
}
