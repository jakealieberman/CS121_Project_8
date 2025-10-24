import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        playGame playGame = new playGame(input);

        boolean running = true;
        while (running) {
            int choice = gameMenu.menuChoice(input);

            if (choice == 1) {
                playGame.playhumanGuesser();
            } else if (choice == 2) {
                playGame.playcomputerGuesser();
            } else if (choice == 0) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid");
            }

            System.out.println();
        }

        input.close();
    }
}