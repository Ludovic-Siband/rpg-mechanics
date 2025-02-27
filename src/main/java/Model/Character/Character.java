package Model.Character;

import Model.Equipment.Weapon;
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
    protected Weapon equippedWeapon = null;
    protected CharacterClassType characterClassType;

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = Math.max(healthPoints, 0);
    }

    /**
     * Attack an opponent character
     * @param target Opponent character to attack
     */
    public void attack(Character target) {
        if (this.getHealthPoints() <= 0){
            System.out.println("\n"+this.name + " is dead and cannot attack.");
            return;
        }
        String weaponName = (equippedWeapon != null) ? equippedWeapon.getName() : "bare hands";
        System.out.println("\n" + this.name + " hits with his " + weaponName + ".");

        int baseDamage = getAttackPower();
        int weaponBonus = (equippedWeapon != null) ? equippedWeapon.getPowerAttack() : 0;

        double criticalFailChance = Math.max(0, (30.0 - target.getDexterity()) / 100.0);
        if (Math.random() < criticalFailChance) {
            System.out.println("It's not very effective... The attack misses!");
            return;
        }

        double criticalHitChance = Math.min(0.5, this.dexterity / 100.0);
        boolean isCriticalHit = Math.random() < criticalHitChance;
        double damageMultiplier = isCriticalHit ? 1.5 : 1.0;

        int finalDamage = (int) (((baseDamage + weaponBonus) - (target.getDefense() / 2.0)) * damageMultiplier);
        finalDamage = Math.max(finalDamage, 1);
        target.setHealthPoints(target.getHealthPoints() - finalDamage);

        System.out.println(isCriticalHit ? "Wow, it's super effective!" : "Attack is successful!");
        System.out.println(target.getName() + " loses " + finalDamage + " health points.");
        System.out.println(target.getName() + " has " + target.getHealthPoints() + " health points left.");
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        if (equippedWeapon.getAllowedCharacterClasses() == null || !equippedWeapon.getAllowedCharacterClasses().contains(this.characterClassType)) {
            System.out.println(this.name + " can't equip this weapon. Choose one compatible with your class.");
        } else {
            this.equippedWeapon = equippedWeapon;
            System.out.println(this.name + " equipped the " + equippedWeapon.getName());
        }
    }

    protected abstract int getAttackPower();

}
