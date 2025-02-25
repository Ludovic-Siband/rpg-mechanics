import Model.Character;
import Model.CharacterClass;
import Model.CharacterClasses.Archer;
import Model.CharacterClasses.Warrior;
import Model.CharacterClasses.Wizard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Character wizard = new Wizard("Gandalf");

        Character archer = new Archer("Legolas");

        System.out.println(archer.getHealthPoints());
        ((Wizard) wizard).attack((CharacterClass) archer);
        System.out.println(archer.getHealthPoints());




    }
}