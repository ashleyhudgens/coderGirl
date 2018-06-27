import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationTables
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to Multiplication Tables");
        out.println();

        out.print("How large would you like to see them? ");
        int howLarge = keyboard.nextInt();

        for (int row = 0; row <= howLarge; row++)
        {
            for (int column = 0; column <= howLarge; column++)
            {
                out.println(row + " * " + column + " = " + (row * column));
            }
        }
    }
}
