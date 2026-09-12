import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;
        int guess = 0;

        System.out.println("================================");
        System.out.println("       GUESSING GAME");
        System.out.println("================================");
        System.out.println("Guess a number between 1 and 100.");

        // Keep asking until the user guesses correctly
        while (guess != secretNumber) {

            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            attempts++;

            if (guess < secretNumber) {

                System.out.println("Too low! Try a higher number.");

            } else if (guess > secretNumber) {

                System.out.println("Too high! Try a lower number.");

            } else {

                System.out.println("\nCongratulations! 🎉");
                System.out.println("You guessed the correct number!");
                System.out.println("Number of attempts: " + attempts);
            }
        }

        input.close();
    }
}
