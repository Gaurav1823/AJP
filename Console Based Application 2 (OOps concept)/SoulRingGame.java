import java.util.*;

public class SoulRingGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("?? Welcome to Soul Ring ??");
        System.out.println("1. New Game\n2. Options\n3. Exit");
        System.out.print("Choose one of the options: ");

        int a = getIntInput();
        if (a != 1) {
            System.out.println(a == 2 ? "Options menu coming soon!" : "Goodbye!");
            return;
        }

        Player player = chooseClass();

        // Enemy wave using ArrayList
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Goblin());
        enemies.add(new Necromancer());
        enemies.add(new EnemyBoss());

        for (Enemy enemy : enemies) {
            System.out.println("\n?? A wild " + enemy.getName() + " appears!");

            while (enemy.health > 0 && player.health > 0) {
                System.out.println("\n?? Your Health: " + player.health + ", Mana: " + player.mana + ", Stamina: " + player.stamina);
                System.out.println("?? " + enemy.getName() + " Health: " + enemy.health);
                System.out.println("1. Melee Attack\n2. Ranged Attack\n3. Dodge\n4. Use Potion");

                int action = getIntInput();
                switch (action) {
                    case 1 -> enemy.takeDamage("m", player.melee_attack);
                    case 2 -> enemy.takeDamage("r", player.range_attack);
                    case 3 -> {
                        player.dodge();
                        continue;
                    }
                    case 4 -> {
                        player.usePotion();
                        continue;
                    }
                    default -> System.out.println("?? Invalid choice! You lose a turn!");
                }

                if (enemy.health > 0) {
                    if (new Random().nextBoolean()) {
                        enemy.specialAbility(player);
                    } else {
                        int dmg = enemy.attack();
                        player.health -= dmg;
                        System.out.println("?? " + enemy.getName() + " hits you for " + dmg + " damage!");
                    }
                }
            }

            if (player.health <= 0) {
                System.out.println("\n?? You have been defeated by the " + enemy.getName() + ". Game Over.");
                return;
            } else {
                System.out.println("\n?? You defeated the " + enemy.getName() + "!");
            }
        }

        System.out.println("\n!! Congratulations! You've conquered all enemies and restored peace to the realm.");
    }

    static int getIntInput() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("! Please enter a valid number: ");
                sc.nextLine();
            }
        }
    }

    static Player chooseClass() {
        System.out.println("Choose your Class:\n1. Warrior (Melee +5)\n2. Archer (Ranged +4)");
        int choice = getIntInput();
        return switch (choice) {
            case 1 -> {
                System.out.println("You chose Warrior!");
                yield new Warrior();
            }
            case 2 -> {
                System.out.println("You chose Archer!");
                yield new Archer();
            }
            default -> {
                System.out.println("Invalid choice. Defaulting to Warrior.");
                yield new Warrior();
            }
        };
    }
}

// Base character
class Character {
    int health = 100;
    int mana = 100;
    int stamina = 50;
    int melee_attack = 10;
    int range_attack = 8;

    void dodge() {
        if (stamina >= 10) {
            stamina -= 10;
            System.out.println("?? You dodged the next attack!");
        } else {
            System.out.println("You're too tired to dodge!");
        }
    }
}

// Player class with potions
class Player extends Character {
    Map<String, Integer> potions = new HashMap<>();

    public Player() {
        potions.put("Health", 1);
        potions.put("Mana", 1);
        potions.put("Stamina", 1);
    }

    void usePotion() {
        System.out.println("Which potion? 1. Health 2. Mana 3. Stamina");
        int type = SoulRingGame.getIntInput();
        switch (type) {
            case 1 -> consumePotion("Health", () -> health += 30);
            case 2 -> consumePotion("Mana", () -> mana += 30);
            case 3 -> consumePotion("Stamina", () -> stamina += 30);
            default -> System.out.println("Invalid choice.");
        }
    }

    private void consumePotion(String key, Runnable effect) {
        if (potions.get(key) > 0) {
            effect.run();
            potions.put(key, potions.get(key) - 1);
            System.out.println("Used " + key + " Potion!");
        } else {
            System.out.println("No " + key + " potions left!");
        }
    }
}

// Player classes
class Warrior extends Player {
    public Warrior() { melee_attack += 5; }
}

class Archer extends Player {
    public Archer() { range_attack += 4; }
}

// Enemy base
abstract class Enemy extends Character {
    abstract void specialAbility(Player player);
    abstract String getName();
    void takeDamage(String type, int attackerPower) {
        int dmg = type.equalsIgnoreCase("m") ? attackerPower + 2 : attackerPower + 1;
        health -= dmg;
        System.out.println("You dealt " + dmg + " damage!");
    }

    int attack() {
        return new Random().nextInt(10) + 5;
    }
}

// Enemy types
class Goblin extends Enemy {
    public Goblin() {
        health = 50;
        melee_attack = 12;
    }

    @Override
    void specialAbility(Player player) {
        System.out.println("Goblin throws dust! You lose stamina!");
        player.stamina = Math.max(0, player.stamina - 10);
    }

    @Override
    String getName() {
        return "Goblin";
    }
}

class Necromancer extends Enemy {
    public Necromancer() {
        health = 80;
        mana = 150;
        range_attack = 15;
    }

    @Override
    void specialAbility(Player player) {
        System.out.println("Necromancer casts drain! You lose mana.");
        player.mana = Math.max(0, player.mana - 20);
    }

    @Override
    String getName() {
        return "Necromancer";
    }
}

class EnemyBoss extends Enemy {
    public EnemyBoss() {
        health = 120;
        melee_attack = 18;
    }

    @Override
    void specialAbility(Player player) {
        System.out.println("Boss unleashes a devastating strike!");
        player.health -= 20;
    }

    @Override
    String getName() {
        return "Dread Lord";
    }
}
