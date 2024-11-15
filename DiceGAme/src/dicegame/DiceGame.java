
package dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
          
            int dice1 = rollDie(random);
            int dice2 = rollDie(random);
            
            
            int sum = dice1 + dice2;

           
            System.out.print("Guess the sum of two dice (between 2 and 12): ");
            int guess = scanner.nextInt();

           
            System.out.println("The sum of two dice: " + sum);

            if (guess == sum) {
                System.out.println("You WON!");
            } else {
                System.out.println("LOSER!");
            }

         
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();

            
            if (!playChoice.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing!");
            }
        }
        
        scanner.close();
    }


    public static int rollDie(Random random) {
        return random.nextInt(6) + 1; // Random number between 1 and 6 (inclusive)
    }
}
