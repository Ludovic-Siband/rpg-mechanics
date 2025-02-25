package Model.CharacterClasses;

import Model.CharacterClass;
import lombok.Data;

@Data
public class Wizard extends CharacterClass {


    public Wizard(String name) {
        this.name = name;
        this.healthPoints = 100;
        this.strength = 5;
        this.dexterity = 10;
        this.defense = 15;
    }

    @Override
    public void attack(CharacterClass character) {
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
