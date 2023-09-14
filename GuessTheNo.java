package CodsoftInternship;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int minNo = 1;
        int maxNo = 100;
        int maximumAttempts = 5;
        int playerScore = 0;
        
        boolean continuePlaying = true;
        while (continuePlaying) {
            int randomNumber = r.nextInt(maxNo) + 1;
            int Attempts = 0;
            boolean isNumberGuessed = false;
            
            System.out.println("Welcome to the Guess The Number Game!");
            System.out.println("I Have Choosen a number between " + minNo + " and " + maxNo + 
            		". Can you guess it?");
            
            while (Attempts < maximumAttempts && !isNumberGuessed) {
                System.out.print("Your guess: ");
                int playerGuess = s.nextInt();
                Attempts++;
                
                if (playerGuess == randomNumber) {
                    isNumberGuessed = true;
                    playerScore++;
                    System.out.println("Congratulations! You guessed the number in " + Attempts + " attempts.");
                } else if (playerGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!isNumberGuessed) {
                System.out.println("Sorry, you're out of attempts. The number was: " + randomNumber);
            }
            
            System.out.println("Your current score: " + playerScore);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = s.next();
            continuePlaying = playAgainResponse.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing the Number Guessing Game!");
    }
}
