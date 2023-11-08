package task_1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;
        int attempts = 0;
        int roundsWon = 0;

        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a random number between " + lowerBound + " and " + upperBound);

        while (playAgain) {
            attempts = 0;
            int guess;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "): ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
            if (playAgain) {
                numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }
        }

        System.out.println("Thanks for playing! You won " + roundsWon + " round(s).");
    }
}
