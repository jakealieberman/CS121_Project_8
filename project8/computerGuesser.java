import java.util.Scanner;

// computerGuesser

public class computerGuesser {
    private Scanner input;

    public computerGuesser(Scanner input) {
        this.input = input;
    }

    public void play() {
        System.out.println("Computer Guesser");
        System.out.println("Think of a number between 1 and 100.");
        
        // set low high and attempts
        int low = 1;
        int high = 100;
        int attempts = 1;

        // loop until correct guess
        while (low <= high) {
            // computer makes a guess
            double mid = (low + high) / 2.0;
            int guess = (int)Math.round(mid);

            System.out.println("I guess: " + guess);
            System.out.print("Is that (H)igh, (L)ow, or (C)orrect? ");
            String reply = input.nextLine().trim();

            if (reply.equalsIgnoreCase("C")) {
                System.out.println("I got it in " + attempts + " attempts.");
                break;
            } else if (reply.equalsIgnoreCase("H")) {

                high = guess - 1;
            } else if (reply.equalsIgnoreCase("L")) {

                low = guess + 1;
            } else {
                System.out.println("Please answer with H, L, or C.");

                continue;
            }
            // end loop
            attempts++;
        }
    }
}
// end computerGuesser