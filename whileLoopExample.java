import static java.lang.System.out;
import java.util.Scanner;

public class whileLoopExample
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing == true)
        {
            out.println("Are we there yet?");
            String thereYet = keyboard.next();
            if (thereYet.equalsIgnoreCase("no"))
            {
                keepGoing = true;
            } else if (thereYet.equalsIgnoreCase("yes"))
                {
                keepGoing = false;
                out.println("Yay!");
            } else {
                out.println("Huh? I don't understand that.");
            }
        }
    }
}
