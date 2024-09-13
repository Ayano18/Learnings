import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create two Pokemon
        Pokemon player1 = new Pokemon("Pikachu", 200);
        Pokemon player2 = new Pokemon("Charmander", 200);

        while (player1.hp > 0 && player2.hp > 0) {
            // Player 1's turn
            System.out.println("Pikachu's HP: " + player1.hp);
            System.out.println("Charmander's HP: " + player2.hp);
            System.out.println("Pikachu, choose your attack (1: Tackle, 2: Thunder, 3: Tail Whip, 4: ThunderBolt): ");
            int player1Attack = scanner.nextInt();

            int player1Damage = 0;
            if (player1Attack == 1) {
                player1Damage = 10;
                System.out.println("Pikachu used Tackle!");
            } else if (player1Attack == 2) {
                player1Damage = 20;
                System.out.println("Pikachu used Thunder!");
            } else if (player1Attack == 3) {
                player1Damage = 25;
                System.out.println("Pikachu used Thunder!");
            } else if (player1Attack == 4) {
                player1Damage = 30;
                System.out.println("Pikachu used Thunder!");
            } else {
                System.out.println("Invalid attack!");
                continue;
            }

            player2.hp -= player1Damage;
            
            // Player 2's turn
            int player2Attack = random.nextInt(2) + 1; // Generate random attack (1 or 2)
            int player2Damage = 0;
            if (player2Attack == 1) {
                player2Damage = 10;
                System.out.println("Charmander used Scratch!");
            } else if (player2Attack == 2) {
                player2Damage = 15;
                System.out.println("Charmander used Ember!");
            } else if (player2Attack == 3) {
                player2Damage = 25;
                System.out.println("Charmander used FireFang!");
            } else if (player2Attack == 4) {
                player2Damage = 20;
                System.out.println("Charmander used Slash!");
            }

            player1.hp -= player2Damage;
        }

        if (player1.hp <= 0) {
            System.out.println("Charmander wins!");
        } else {
            System.out.println("Pikachu wins!");
        }
    }

    static class Pokemon {
        String name;
        int hp;

        Pokemon(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }
    }
}
