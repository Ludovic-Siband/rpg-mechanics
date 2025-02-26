import Model.Character.Character;
import Model.Character.CharacterClasses.Archer;
import Model.Character.CharacterClasses.Wizard;
import Model.Equipement.Arme;
import Model.Equipement.Weapons.Bow;
import Model.Equipement.Weapons.Staff;
import Model.Equipement.Weapons.Sword;
import Model.Equipement.Equipement;

public class Main {
    public static void main(String[] args) {
//
//        Character wizard = new Wizard("Gandalf");
//        Character archer = new Archer("Legolas");
//
//        ((Archer) archer).attack(wizard);

            Arme Epee = new Sword("aiguille",10,34.6,"arme a une main",35);
            Arme Baton = new Staff("baton de feu", 20,89,"baton magique",56);
            Arme Arc = new Bow("tisseuse",10,120.6,"arc lourd",65);

            System.out.println(Epee);
            System.out.println(Baton);
            System.out.println(Arc);

        }
}