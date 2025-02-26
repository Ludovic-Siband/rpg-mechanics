package Model.Character.CharacterClasses;

import Model.Character.Character;
import Model.Character.ICharacterClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Warrior extends Character implements ICharacterClass {

    public Warrior(String name) {
        this.name = name;
        this.healthPoints = 115;
        this.strength = 20;
        this.dexterity = 5;
        this.defense = 10;
        this.intelligence = 5;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.name + " casts BROOAAAH!");

        int opponentDexterity = character.getDexterity();
        double criticalFailChance = switch (opponentDexterity) {
            case 5 -> 0.25;
            case 10 -> 0.15;
            case 15 -> 0.05;
            default -> 0.0;
        };

        if (Math.random() < criticalFailChance) {
            System.out.println("BROOAAAH is not very effective...");
        } else {
            character.setHealthPoints(character.getHealthPoints() - 15);
            System.out.println("BROOAAAH is successful!");
        }
        // "Wow, BROOAAAH is super effective !"

        System.out.println(character.getName()+ " have " + character.getHealthPoints() + " health points left.");
    }

    @Override
    public void setWeapon() {
        System.out.println("The warrior " + this.name + " has a sword.");
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
