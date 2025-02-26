package Services;

import Model.Character.Character;


public class Combat {

    private final Character player;
    private final Character enemy;

    public Combat(Character player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void start() {

        while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CombatView.displayStartedFight(player, enemy);
            int choice = CombatView.displayFightMenu();

            switch (choice) {
                case 1:
                    System.out.println("\nYou chose to attack!");
                    this.attack(player, enemy);
                    break;
                case 2:
                    System.out.println("\nYou chose to defend!");
                    break;
                case 3:
                    System.out.println("\nYou used a health potion!");
                    this.drinkHealthPotion(player);
                    enemy.attack(player);
                    break;
                case 4:
                    System.out.println("\nYou fled from the battle!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }


        }
        System.out.println("===========================");
        System.out.println("\n  ----- FIGHT ENDED -----\n");
        System.out.println("===========================");
    }

    private void drinkHealthPotion(Character player) {
        int newHealthPoints;
        if (player.getHealthPoints() == player.getMaxHealthPoints()) {
            System.out.println("You already have maximum health points.");
        } else {
            newHealthPoints = Math.min(player.getHealthPoints() + 30, player.getMaxHealthPoints());
            player.setHealthPoints(newHealthPoints);
            System.out.println("You recovered 30 health points.");
        }
    }

    private void attack(Character player, Character enemy) {
        try {
            Thread.sleep(500);
            player.attack(enemy);
            if (enemy.getHealthPoints() <= 0) {
                System.out.println("\n"+enemy.getName() + " has been defeated!"+"\n");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(500);
            enemy.attack(player);
            if (player.getHealthPoints() <= 0) {
                System.out.println(player.getName() + " has been defeated!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}