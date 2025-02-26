package Model.Character.CharacterClasses;

import Model.Character.Character;
import Model.Character.ICharacterClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Archer extends Character implements ICharacterClass {

    public Archer(String name) {
        this.name = name;
        this.healthPoints = 85;
        this.strength = 10;
        this.dexterity = 20;
        this.defense = 5;
        this.intelligence = 15;
    }

    @Override
    public void attack(Character character) {
        System.out.println(this.name + " casts TWIIISH!");

        int opponentDexterity = character.getDexterity();
        int opponentDefense = character.getDefense();

        // Calculate the critical fail chance
        double criticalFailChance = Math.max(0, (30.0 - opponentDexterity) / 100.0);
        // Calculate the critical hit chance
        double criticalHitChance = Math.min(0.5, this.dexterity / 100.0);
        boolean isCriticalHit = Math.random() < criticalHitChance;
        double damageMultiplier = isCriticalHit ? 1.5 : 1.0;

        // Calculate the damage
        int baseDamage = this.dexterity;
        int finalDamage = (int) ((baseDamage - ((double) opponentDefense / 2)) * damageMultiplier);
        finalDamage = Math.max(finalDamage, 1);
        character.setHealthPoints(character.getHealthPoints() - finalDamage);

        if (Math.random() < criticalFailChance) {
            System.out.println("TWIIISH is not very effective... The attack misses!");
            return;
        }

        System.out.println(isCriticalHit ? "Wow, TWIIISH is super effective !" : "TWIIISH is successful!");
        System.out.println(character.getName()+ " loose " + finalDamage + " health points.");
        System.out.println(character.getName()+ " have " + character.getHealthPoints() + " health points left.");
    }

    @Override
    public void setWeapon() {
        System.out.println("The archer " + this.name + " has a bow.");
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
