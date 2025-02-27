package Model.Equipment;

import Model.Character.CharacterClassType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Weapon extends Equipment {
    public int PowerAttack;
    protected List<CharacterClassType> allowedCharacterClasses;

    public Weapon() {
        // Initialisation vide de allowedCharacterClasses si nécessaire
        this.allowedCharacterClasses = new ArrayList<>();
    }

}
