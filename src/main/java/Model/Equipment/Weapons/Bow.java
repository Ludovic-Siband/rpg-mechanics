package Model.Equipment.Weapons;

import Model.Character.CharacterClassType;
import Model.Character.CharacterClasses.Archer;
import Model.Equipment.Weapon;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
public class Bow extends Weapon {

    public Bow() {
        this.name = "Bow";
        this.weight = 10;
        this.price = 100;
        this.PowerAttack = 10;
        this.allowedCharacterClasses = List.of(CharacterClassType.ARCHER);;
    }
}
