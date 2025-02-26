package Model.Character;

import lombok.Data;

@Data
public abstract class Character {

    protected String name;
    protected int healthPoints;
    protected int strength;
    protected int dexterity;
    protected int defense;
    protected int intelligence;
    protected CharacterRace characterRace;
}
