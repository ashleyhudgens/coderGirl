import static java.lang.System.out;
import java.util.Scanner;

public class secondForLoopPractice
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        boolean keepGoing = true;

        out.println("Welcome to the bar chart");
        out.println();
        while (keepGoing) {
            out.print("Number? ");
            userInput = keyboard.nextInt();
            barGraph(userInput);
            out.println();
            if (userInput == 0) {
                keepGoing = false;
                out.println("Have a good day!");
            }
        }
    }

    public static String barGraph(int number)
    {
        for (int counter = 0; counter < number; counter++)
        {
            out.print("#");
        }

        return " ";
    }
}
