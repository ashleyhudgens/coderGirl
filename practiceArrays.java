import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Arrays;

public class practiceArrays
{
    public static void main(String[] args)
    {
        int weekOneTemps[] = {65, 68, 72, 83, 73, 66, 85};
        int weekTwoTemps[] = {86, 87, 85, 78, 79, 78, 80};
        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String weekOneDays = "";
        String weekTwoDays = "";
        int sumWeekOne = 0;

        int sumWeekTwo = 0;
        int averageWeekOne;
        int averageWeekTwo;
        int maxWeekOne = weekOneTemps[0];
        int maxWeekTwo = weekTwoTemps[0];
        String highestDayWeekOne;
        String highestDayWeekTwo;

        int highestTempWeekTwo;

        //print week one temps
        out.println("Week 1 High Temperatures");
        for (int index = 0; index < weekOneTemps.length; index++)
        {
            out.print(weekOneTemps[index] + ", ");
        }
        out.println("");
        out.println("");

        //print week two temps
        out.println("Week 2 High Temperatures");
        for (int index = 0; index < weekTwoTemps.length; index++)
        {
            out.print(weekTwoTemps[index] + ", ");
        }
        out.println("");
        out.println("");

        //calculate average for week one
        for (int index = 0; index < weekOneTemps.length; index++)
        {
            sumWeekOne += weekOneTemps[index];
        }
        averageWeekOne = sumWeekOne / weekOneTemps.length;
        out.println("The average daily-high temperature for week 1 is " + averageWeekOne + ".");

        //calculate average for week two
        for (int index = 0; index < weekTwoTemps.length; index++)
        {
            sumWeekTwo += weekTwoTemps[index];
        }
        averageWeekTwo = sumWeekTwo / weekTwoTemps.length;
        out.println("The average daily-high temperature for week 2 is " + averageWeekTwo + ".");

        //calculate highest temp for week one
        for (int index = 0; index < weekOneTemps.length; index++)
        {
            if (weekOneTemps[index] > maxWeekOne)
            {
                maxWeekOne = weekOneTemps[index];
                weekOneDays = weekDays[index];
            }
        }

        //calculate highest temp for week two
        for (int index = 0; index < weekTwoTemps.length; index++)
        {
            if (weekTwoTemps[index] > maxWeekTwo)
            {
                maxWeekTwo = weekTwoTemps[index];
                weekTwoDays = weekDays[index];
            }
        }

        out.println("In week 1, " + weekOneDays + " was warmest, at " + maxWeekOne + " degrees.");
        out.println("In week 2, " + weekTwoDays + " was warmest, at " + maxWeekTwo + " degrees.");

    }
}
