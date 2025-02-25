package Model.CharacterClasses;

import Model.Character;
import Model.ICharacterClass;

public class Warrior extends Character implements ICharacterClass {

    public Warrior(String name) {
        this.name = name;
        this.healthPoints = 115;
        this.strength = 15;
        this.dexterity = 5;
        this.defense = 10;
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
