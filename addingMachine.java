import static java.lang.System.out;
import java.util.Scanner;

public class addingMachine
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        boolean keepGoing = true;
int numberOfNumbers = 0;

        out.println("Welcome!");
        out.println();
        out.println("Total: 0");
        out.println();
        while (keepGoing == true)
        {
            out.print("Add: ");
            double userInput = keyboard.nextDouble();
            out.println();
            total += userInput;
            numberOfNumbers++;
            out.println("Total: " + total);

            if (userInput == 0)
            {
                numberOfNumbers--;
                keepGoing = false;
                out.println("You entered " + numberOfNumbers + " for a final total of " + total);
            }
        }
    }
}
