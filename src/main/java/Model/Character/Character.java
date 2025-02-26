package Model.Character;

import lombok.Data;

import java.util.List;

@Data
public abstract class Character {

    protected String name;
    protected int maxHealthPoints;
    protected int healthPoints;
    protected int strength;
    protected int dexterity;
    protected int defense;
    protected int intelligence;

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = Math.max(healthPoints, 0);
    }

    /**
     * Attack an opponent character
     * @param character Opponent character to attack
     */
    public abstract void attack(Character character);

    /**
     * Bind a weapon to the character
     */
    public abstract void setWeapon();

    /**
     * Get the character's information
     * @return List of strings containing the character's information
     */
    public abstract List<String> getInfo();


}
