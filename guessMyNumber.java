import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class guessMyNumber
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random number = new Random();
        int numberGuess = number.nextInt(100);
        boolean keepGoing = true;

        out.println("I'm thinking of a number between 1 and 100. What is it?");
        out.println();

        while (keepGoing == true)
        {
            out.println("Guess");
            int guess = keyboard.nextInt();

            if (guess == numberGuess)
            {
                out.println("You got it! The number was " + numberGuess);
                keepGoing = false;
            } else if (guess < numberGuess)
            {
                out.println("This number is too low. Try a higher number!");
            } else if (guess > numberGuess)
            {
                out.println("This number is too high. Try a lower number!");
            }
        }
    }
}
