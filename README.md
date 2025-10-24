# CS121 Project 8

## Algorithm
* Input
  * Integer for menu choice
  * Another input depending on what menu choice was selected
* Goal
  * If user chooses human guesser, the computer generates a random number and the human guesses it
  * if user chooses computer guesser, the human thinks of a number and the computer tries to guess it
* Steps
  1. Display menu options of 0 = exit, 1 = human guesser, and 2 = computer guesser
  2. prompt user to enter a number between 0 - 2
  3. Use loop to keep the program running until user chooses 0
  4. if choice = 1
     * print "human guesser"
     * generate a random number between 1 and 100
     * initialize attempt = 1
     * loop
       * ask user to enter a number
       * if guess < num print "too low"
       * if guess > number print "too high"
       * if guess == number print "got it" then break loop
       * increment attempt by 1
  5. if choice = 2
     * print computer guesser
     * ask human to think of a number between 1 and 100
     * intialize low = 1, high = 100, and attempt = 1
       * loop called keepGoing, which keeps track of attempts
         * guess = find mean of low + high
         * use math.round() on guess
         * print "i guess [guess]
         * ask user too (H)igh, too (L)ow, or (C)orrect
         * if answer = C print "got it" and break
         * if answer = H set high = guess - 1
         * if answer = L set low = guess + 1
         * increment attempt by 1
    6. if choice = 0
       * print "goodbye!" and exit the loop
    7. end program
      
