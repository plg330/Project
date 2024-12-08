
import java.util.Random;
import java.util.Scanner;

public class test {

    public static class Pet {
        public String name; 
        public Stats stat;
        public Attack attack1;
        public Attack attack2;

        public Pet(String name) {
            this.name = name;
            this.stat = new Stats();
            this.stat.endurance = 20;
            this.stat.health = 100;
            this.stat.speed = 10; 
            this.stat.streakMultiplier = 0;

            this.attack1 = new Attack("Basic Attack", 5, 1);
            this.attack2 = new Attack("Special Attack", 10, 5);
        }
    }
    
    public static class Attack {
        public String name;
        public int damage;
        public int energy;

        public Attack(String name, int damage, int energy) {
            this.name = name;
            this.damage = damage;
            this.energy = energy;
        }
    }

    public static class Stats {
        public int health;
        public int strength;
        public int speed;
        public int endurance; 
        public int streakMultiplier;
    }

    public static class Enemy extends Pet {
        public Enemy(String name) {
            super(name);
        }
    }

    public static class User extends Pet {
        public User(String name) {
            super(name);
        }
    }

    public static class Battle {
        private User user;
        private Enemy enemy;

        public Battle(User user, Enemy enemy) {
            this.user = user;
            this.enemy = enemy;
        }

        public void startBattle() {
        	Scanner input = new Scanner(System.in);
        	
            System.out.println("A battle starts between " + user.name + " and " + enemy.name + "!");
            Random rand = new Random();

            while (user.stat.health > 0 && enemy.stat.health > 0) {
                // User's turn
            	System.out.printf("What attack do you want to use(1 or 2)(energy left %d)",user.stat.endurance);
            	int choice =input.nextInt();
            	
            	if (choice == 1) {
            		performAttack(user, enemy, user.attack1);
            	}else
                performAttack(user, enemy, user.attack2);
                if (enemy.stat.health <= 0) {
                    System.out.println(enemy.name + " has been defeated!");
                    break;
                }

                // Enemy's turn (random attack)
                performAttack(enemy, user, enemy.attack1);
                if (user.stat.health <= 0) {
                    System.out.println(user.name + " has been defeated!");
                }
            }
        }

        private void performAttack(Pet attacker, Pet defender, Attack attack) {
            if (attacker.stat.endurance >= attack.energy) {
                attacker.stat.endurance -= attack.energy;
                defender.stat.health -= attack.damage;
                System.out.printf("%s uses %s which does %d damage! %s's health is now %d.%n", 
                                  attacker.name, attack.name, attack.damage, defender.name, defender.stat.health);
            } else {
                System.out.printf("%s doesn't have enough endurance to perform %s!%n", attacker.name, attack.name);
            }
        }
    }

    public static void main(String[] args) {
        User user = new User("Bob");
        Enemy enemy = new Enemy("Frank");
        Battle battle = new Battle(user, enemy);
        battle.startBattle();
    }
}
