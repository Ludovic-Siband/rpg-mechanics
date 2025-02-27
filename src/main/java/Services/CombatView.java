package Services;

import Model.Character.Character;

import java.util.Scanner;

public class CombatView {

    private static final Scanner scanner = new Scanner(System.in);


    public static void displayStartedFight(Character player, Character enemy) {
        System.out.println("\n----- FIGHT STARTED -----\n");
        displayHealthBar(player);
        displayHealthBar(enemy);
    }

    public static void displayHealthBar(Character character) {
            int healthBarLength = 50;
            int healthRatio = (int) ((double) character.getHealthPoints() / character.getMaxHealthPoints() * healthBarLength);

            StringBuilder healthBar = new StringBuilder("[");
            for (int i = 0; i < healthBarLength; i++) {
                if (i < healthRatio) {
                    healthBar.append("=");
                } else {
                    healthBar.append(" ");
                }
            }
            healthBar.append("]");

            System.out.println(character.getName() + " - Health: " + healthBar + " " + character.getHealthPoints() + "/" + character.getMaxHealthPoints());
    }

    public static int displayFightMenu() {
        System.out.println("\n===== Fight Menu =====\n");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Use Health Potion");
        System.out.println("4. Flee");

        System.out.print("\nChoose an action: ");
        return scanner.nextInt();
    }
}
