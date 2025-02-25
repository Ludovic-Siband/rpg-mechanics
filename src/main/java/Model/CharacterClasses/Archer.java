package Model.CharacterClasses;

import Model.Character;
import Model.ICharacterClass;

public class Archer extends Character implements ICharacterClass {

    public Archer(String name) {
        this.name = name;
        this.healthPoints = 85;
        this.strength = 10;
        this.dexterity = 15;
        this.defense = 5;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.name + " is attacking!");

        int opponentDexterity = character.getDexterity();
        double criticalFailChance = switch (opponentDexterity) {
            case 5 -> 0.25;
            case 10 -> 0.15;
            case 15 -> 0.05;
            default -> 0.0;
        };

        if (Math.random() < criticalFailChance) {
            System.out.println(this.name + "'s attack has failed critically!");
        } else {
            character.setHealthPoints(character.getHealthPoints() - 15);
            System.out.println(this.name + "'s attack is successful!");
        }
    }
}
