import static java.lang.System.out;
import java.util.Scanner;

public class forLoopExample
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("How big of a number should I count to?");
        int maxNumber = keyboard.nextInt();

        for (int counter = 1; counter <= maxNumber; counter++)
        {
            out.print(counter + " ");
        }

        out.println();

        for (int back = maxNumber; back >= 1; back--)
        {

            out.print(back + " ");
        }
    }
}
