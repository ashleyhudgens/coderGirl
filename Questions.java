import static java.lang.System.out;
import java.util.Scanner;

public class Questions
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        out.print("What's your name? ");
        name = keyboard.next();

        int favoriteNumber;
        out.print("What's your favorite number? ");
        favoriteNumber = keyboard.nextInt();

        out.println("Hi " + name + ".");
        out.println("Your favorite number is " + favoriteNumber);
    }
}
