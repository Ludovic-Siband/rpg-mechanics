import Model.Character.Character;
import Model.Character.CharacterClasses.Archer;
import Model.Character.CharacterClasses.Wizard;
import Model.Equipment.Weapons.Bow;
import Model.Equipment.Weapons.Staff;
import Services.Combat;

public class Main {
    public static void main(String[] args) {

        Character wizard = new Wizard("Gandalf");
        Character archer = new Archer("Legolas");

        wizard.setEquippedWeapon(new Staff());
        archer.setEquippedWeapon(new Bow());

        Combat combat = new Combat(wizard, archer);
        combat.start();
    }
}