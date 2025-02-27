import Model.Character.Character;
import Model.Character.CharacterClasses.Archer;
import Model.Character.CharacterClasses.Warrior;
import Model.Character.CharacterClasses.Wizard;
import Model.Equipment.Weapon;
import Model.Equipment.Weapons.Bow;
import Model.Equipment.Weapons.Staff;
import Model.Equipment.Weapons.Sword;
import Services.Combat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your character class:");
        System.out.println("1. Warrior");
        System.out.println("2. Archer");
        System.out.println("3. Mage");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your character's name:");
        String name = scanner.nextLine();

        Character player = switch (choice) {
            case 1 -> new Warrior(name);
            case 2 -> new Archer(name);
            case 3 -> new Wizard(name);
            default -> {
                System.out.println("Invalid choice. Defaulting to Warrior.");
                yield new Warrior(name);
            }
        };

        player.setEquippedWeapon(switch (choice) {
            case 1 -> new Sword();
            case 2 -> new Bow();
            case 3 -> new Staff();
            default -> null;
        });

        System.out.println("\nYou have created a " + player.getClass().getSimpleName() + " named " + player.getName() + "!");
        System.out.println(player.getName() + " has " + (player.getEquippedWeapon() != null ? "equipped the " + player.getEquippedWeapon().getName() : "no weapon equipped."));

        Character enemy = new Warrior("Enemy");
        enemy.setEquippedWeapon(new Sword());

        Combat combat = new Combat(player, enemy);
        combat.start();
    }
}