package Model.Character;

import java.util.List;

public interface ICharacterClass {

    /**
     * Attack an opponent character
     * @param character Opponent character to attack
     */
    void attack(Character character);

    /**
     * Bind a weapon to the character
     */
    void setWeapon();

    /**
     * Get the character's information
     * @return List of strings containing the character's information
     */
    List<String> getInfo();


}
