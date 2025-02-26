package Model.Character.CharacterClasses;

import Model.Character.Character;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Wizard extends Character {


    public Wizard(String name) {
        this.name = name;
        this.maxHealthPoints = 100;
        this.healthPoints = this.maxHealthPoints;
        this.strength = 5;
        this.dexterity = 10;
        this.defense = 15;
        this.intelligence = 20;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.name + " casts Wololo!");

        int opponentDexterity = character.getDexterity();
        double criticalFailChance = switch (opponentDexterity) {
            case 5 -> 0.25;
            case 10 -> 0.15;
            case 15 -> 0.05;
            default -> 0.0;
        };

        if (Math.random() < criticalFailChance) {
            System.out.println("Wololo is not very effective...");
        } else {
            character.setHealthPoints(character.getHealthPoints() - 15);
            System.out.println("Wololo is successful!");
        }
        // "Wow, Wololo is super effective !"

        System.out.println(character.getName()+ " have " + character.getHealthPoints() + " health points left.");
    }

    @Override
    public void setWeapon() {
        System.out.println("The wizard " + this.name + " has a magic wand.");
    }

    @Override
    public List<String> getInfo() {
        List<String> info = new ArrayList<>();
        info.add("Name: " + this.name);
        info.add("Health Points: " + this.healthPoints);
        info.add("Strength: " + this.strength);
        info.add("Dexterity: " + this.dexterity);
        info.add("Defense: " + this.defense);
        return info;
    }
}
