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

        while (player.getHealthPoints() > 0 || enemy.getHealthPoints() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            CombatView.displayStartedFight(player, enemy);
            int choice = CombatView.displayFightMenu();

            switch (choice) {
                case 1:
                    System.out.println("You chose to attack!");
                    this.attack(player, enemy);
                    break;
                case 2:
                    System.out.println("You chose to defend!");
                    break;
                case 3:
                    System.out.println("You used a health potion!");
                    break;
                case 4:
                    System.out.println("You fled from the battle!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }


        }

        System.out.println("----- FIGHT ENDED -----");
    }

    private void attack(Character player, Character enemy) {
        try {
            Thread.sleep(500);
            player.attack(enemy);
            if (enemy.getHealthPoints() <= 0) {
                System.out.println(enemy.getName() + " has been defeated!");
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