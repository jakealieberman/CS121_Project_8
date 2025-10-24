import java.util.Scanner;

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
        humanMode.play();
    }

    public void playcomputerGuesser() {
        computerMode.play();
    }
}