package task_1;
import java.util.Scanner;
import java.util.Random;

class RandomNumber{
	public static int genNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}
}

public class NumberGuess {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Number Guessing Game!");
		
		Scanner sc = new Scanner(System.in);
		int minValue, maxValue;
        int maxAttempts = 3;
        int attempts = 0;
        int roundsWon = 0;
        int noOfRounds = 0;

        boolean playAgain = true;

        while (playAgain) {
        	
        	System.out.println("Enter the minimum number : ");
    		minValue = sc.nextInt();
    		
    		System.out.println("Enter the maximum number : ");
    		maxValue = sc.nextInt();

            int numberToGuess = RandomNumber.genNumber(minValue, maxValue);
            
            attempts = 0;
            int guess;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "): ");
                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    roundsWon++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Try a higher number.");
                } else if(guess > numberToGuess){
                    System.out.println("Try a lower number.");
                } else {
                	System.out.println("Try guessing the number within given range!!");
                }
            }

            if (attempts > maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
            
            if (playAgain) {
                numberToGuess = RandomNumber.genNumber(minValue, maxValue);
            }
            noOfRounds++;
        }

        System.out.println("Thanks for playing! You won " + roundsWon + " round(s) out of " + noOfRounds);
	}

}
