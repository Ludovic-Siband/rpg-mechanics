package Model.Equipment.Weapons;

import Model.Character.CharacterClassType;
import Model.Equipment.Weapon;
import lombok.Data;

import java.util.List;

@Data
public class Staff extends Weapon {

    public Staff() {
        this.name = "Staff";
        this.weight = 10;
        this.price = 100;
        this.PowerAttack = 10;
        this.allowedCharacterClasses = List.of(CharacterClassType.WIZARD);
    }
}
