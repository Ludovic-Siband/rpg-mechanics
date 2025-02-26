import Model.Character.Character;
import Model.Character.CharacterClasses.Archer;
import Model.Character.CharacterClasses.Wizard;
import Services.Combat;

public class Main {
    public static void main(String[] args) {

        Character wizard = new Wizard("Wizard");
        Character archer = new Archer("Archer");

        Combat combat = new Combat(wizard, archer);
        combat.start();
    }
}