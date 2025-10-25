import java.util.Scanner;

// playGame
/* purpose of playGame is to manage the two game modes
which are humanGuesser and computerGuesser */

public class playGame {
    private Scanner input;
    private humanGuesser humanMode;
    private computerGuesser computerMode;

    public playGame(Scanner input) {
        this.input = input;
        this.humanMode = new humanGuesser(input);
        this.computerMode = new computerGuesser(input);
    }

    public void playhumanGuesser() {
        humanMode.play(); // call human moder
    }

    public void playcomputerGuesser() {
        computerMode.play(); // call computer mode
    }
} // end playGame