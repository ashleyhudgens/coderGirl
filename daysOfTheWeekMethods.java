import static java.lang.System.out;
import java.util.Scanner;

public class daysOfTheWeekMethods
{
    public static void main(String[] args)
    {
        //asks the user for a number from 1-7 and prints the name of that day of the week
        Scanner keyboard = new Scanner(System.in);

        out.println("Weekday Example:");
        out.println();

        out.println("Enter a number from 1 to 7: ");
        int dayNumber = keyboard.nextInt();

        String name = getDayName(dayNumber);
        out.println("The " + dayNumber + getNumberTh(dayNumber) + " day of the week is " + name + ".");

    }

    public static String getNumberTh(int num)
    {
        if (num ==1)
        {
            return "st";
        } else if (num == 2)
        {
            return "nd";
        } else if (num == 3)
        {
            return "rd";
        }else if (num == 4)
        {
            return "th";
        } else if (num == 5)
        {
            return "th";
        } else if (num == 6)
        {
            return "th";
        } else if (num == 7)
        {
            return "th";
        }
         return"";
    }

    public static String getDayName(int day)
    {
        //given a day number, returns the full name of that day of the week
        String dayName = "Unknown";

        if (day == 1)
        {
            dayName = "Sunday";
        } else if (day == 2)
        {
            dayName = "Monday";
        } else if (day == 3)
        {
            dayName = "Tuesday";
        } else if (day == 4)
        {
            dayName = "Wednesday";
        } else if (day == 5)
        {
            dayName = "Thursday";
        } else if (day == 6)
        {
            dayName = "Friday";
        } else if (day == 7)
        {
            dayName = "Saturday";
        }
        return dayName;
    }
}
