import static java.lang.System.out;
import java.util.Scanner;

public class freeStyle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to the case tracker!");
        out.println();

        out.println("What is the case reason?");
        String caseReason = keyboard.next();
        out.println();

        out.println("What is the case number");
        int caseNumber = keyboard.nextInt();
        out.println();

        out.println("How many minutes was the case open?");
        int minutesOpen = keyboard.nextInt();
        out.println();

        float convertMinutesToHours = (float)minutesOpen / 60;

        out.println("Congratulations! You closed case number " + caseNumber + " for " + caseReason + " in " + convertMinutesToHours + " hours!");
    }
}
