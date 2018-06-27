import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationGrid
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;

        out.println("Welcome to Multiplication Tables");
        out.println();


        out.print("How large would you like to see them? ");
        int howLarge = keyboard.nextInt();

        if (howLarge > 20)
        {
            out.println("That number is too large");
        }

        for (int row = 1; row <= howLarge; row++)
        {
            out.println((row + 1) + " ");
            for (int column = 0; column <= howLarge; column++)
            {
                out.print((column * row) + " ");
            }

        }
    }
}
