// Main Class

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void displayStats(GameCharacter player, GameCharacter enemy) { // shows status
        System.out.println("-------- Game Stats--------------");
        System.out.println(player.getName() + " - Health: " + player.getHealth() + " , Power: " + player.getPower());
        System.out.println(enemy.getName() + " - Health: " + enemy.getHealth() + " , Power: " + enemy.getPower());
    }

    public static void startGame(GameCharacter player, GameCharacter enemy) { // starts the game
        System.out.println(
                player.getName() + " the " + player.getClass().getSimpleName() + " enters the world of Aetherfall!");
        System.out.println(enemy.getName() + " rises to start spread chaos!");
        System.out.println("Battle Start!");
        displayStats(player, enemy);
    }

    public static void displayResult(GameCharacter player, GameCharacter enemy) { // shows result when game is over
        System.out.println("---------Results-----------------");
        if (!player.isAlive()) {
            System.out.println(enemy.getName() + " wins the battle!");
            System.out.println(player.getName() + " the " + player.getClass().getSimpleName() + " has been defeated!");
        } else {
            System.out.println(player.getName() + " the " + player.getClass().getSimpleName() + " wins the battle!");
            System.out.println(enemy.getName() + " has been defeated!");
        }
    }

    public static void displayInputWindow() {
        System.out.println("You have chosen Mage");
        System.out.println("Enter your mage name");
        System.out.print("> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // for taking input
        Random random = new Random(); // for choices in the opponents
        GameCharacter player = null; // creating two objects
        GameCharacter enemy = null;
        String playerName;
        int choice;
        // Input player choices
        System.out.println("Choose a character: 1. Mage 2. Archer 3. Warrior");
        System.out.print("> ");
        choice = scanner.nextInt();
        scanner.nextLine(); // to consume nextLine
        switch (choice) { // choosing protagonist type
            case 1:
                System.out.println("You have chosen Mage");
                System.out.println("Enter your mage name");
                System.out.print("> ");
                playerName = scanner.nextLine();
                player = new Mage(playerName);
                break;
            case 2:
                System.out.println("You have chosen Archer");
                System.out.println("Enter your archer name");
                System.out.print("> ");
                playerName = scanner.nextLine();
                player = new Archer(playerName);
                break;
            case 3:
                System.out.println("You have chosen Warrior");
                System.out.println("Enter your warrior name");
                System.out.print("> ");
                playerName = scanner.nextLine();
                player = new Warrior(playerName);
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Choose a villain to fight against: ");
        System.out.println("1. Dark Overlord");
        System.out.println("2. Regional Warlord");
        System.out.println("3. Corrupted Mortal");
        // Input choice for selecting enemy
        System.out.print("> ");
        choice = scanner.nextInt();
        switch (choice) { // choosing antagonist type
            case 1:
                enemy = new DarkOverlord();
                break;
            case 2:
                enemy = new RegionalWarlord();
                break;
            case 3:
                enemy = new CorruptedMortal();
                break;
            default:
                System.out.println("Invalid Input");
        }
        startGame(player, enemy);
        scanner.nextLine();
        while (player.isAlive() && enemy.isAlive()) { // loop runs until any of the player or enemy dies
            System.out.println("Player's Turn : ");
            System.out.print("> ");
            String command = scanner.nextLine();
            switch (command) {
                case "attack":
                case "Attack":
                    player.attack(enemy);
                    break;
                case "special":
                case "Special":
                    player.special(enemy);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid command. Try again using (attack, special, Attack, Special or exit)");
                    continue;
            }
            displayStats(player, enemy);
            if (enemy.isAlive()) {
                System.out.println("Enemy's Turn: ");
                int decision = random.nextInt(2); // 0-attack 1-special
                switch (decision) {
                    case 0:
                        enemy.attack(player);
                        break;
                    case 1:
                        enemy.special(player);
                        break;
                }
            } else {
                System.out.println(enemy.getName() + " has already died and defeated do cannot attack.");
            }

            displayStats(player, enemy);
        }
        displayResult(player, enemy);
        scanner.close();
    }
}