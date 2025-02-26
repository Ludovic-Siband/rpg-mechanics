package Model.Equipment;

import Model.Character.CharacterClassType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public abstract class Weapon extends Equipment {
    public int PowerAttack;
    protected List<CharacterClassType> allowedCharacterClasses;
}
