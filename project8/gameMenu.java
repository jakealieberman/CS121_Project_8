import java.util.Scanner;

// gameMenu

public class gameMenu {
// menu choices
public static int menuChoice(Scanner input) {
        System.out.println("0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
        System.out.print("Please enter 0-2:");

        int choice = input.nextInt(); // get choice
        input.nextLine();
        return choice;
    }
} // end gameMenu