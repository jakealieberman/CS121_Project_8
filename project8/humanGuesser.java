import java.util.Scanner;
import java.util.Random;

// humanGuesser

public class humanGuesser {
    private Scanner input;
    private Random rand;

    public humanGuesser(Scanner input) {
        this.input = input;
        this.rand = new Random();
    }

    public void play() {
        System.out.println("Human Guesser");
        int secretNumber = rand.nextInt(100) + 1; // set random number
        int attempts = 1; // set attempts

        // loop until correct guess
        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = input.nextInt();
            input.nextLine();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("You got it in " + attempts + " attempts.");
                break;
            } // end loop

            attempts++;
        }
    }
} // end humanGuesser