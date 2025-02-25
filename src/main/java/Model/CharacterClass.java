package Model;

import lombok.Data;

@Data
public abstract class CharacterClass extends Character {

    public abstract void attack(CharacterClass character);
}
