import Model.Character.Character;
import Model.Character.CharacterClasses.Archer;
import Model.Character.CharacterClasses.Wizard;

public class Main {
    public static void main(String[] args) {

        Character wizard = new Wizard("Gandalf");
        Character archer = new Archer("Legolas");

        ((Archer) archer).attack(wizard);
    }
}