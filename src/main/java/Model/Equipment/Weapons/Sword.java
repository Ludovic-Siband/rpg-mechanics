package Model.Equipment.Weapons;

import Model.Character.CharacterClassType;
import Model.Equipment.Weapon;
import lombok.Data;

import java.util.List;

@Data
public class Sword extends Weapon {

    public Sword() {
        this.name = "Sword";
        this.weight = 10;
        this.price = 100;
        this.PowerAttack = 10;
        this.allowedCharacterClasses = List.of(CharacterClassType.WARRIOR);
    }
}
