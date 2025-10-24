import java.util.Scanner;
import java.util.Random;

public class humanGuesser {
    private Scanner input;
    private Random rand;

    public humanGuesser(Scanner input) {
        this.input = input;
        this.rand = new Random();
    }

    public void play() {
        System.out.println("Human Guesser");
        int secretNumber = rand.nextInt(100) + 1;
        int attempts = 1;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = input.nextInt();
            input.nextLine();

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Got it!");
                System.out.println("You got it in " + attempts + " attempts.");
                break;
            }

            attempts++;
        }
    }
}