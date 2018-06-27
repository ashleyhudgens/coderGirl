import static java.lang.System.out;

public class formatDates
{
    public static void main(String[] args)
    {
        out.println(formatNumberAsTwoDigits(3));
        out.println(formatNumberAsTwoDigits(9));
        out.println(formatNumberAsTwoDigits(10));
        out.println(formatNumberAsTwoDigits(12));
        out.println();

        printDate(2014, 10, 4);
        printDate(2015, 1, 1);
        printDate(2013, 12, 31);
    }

    public static String formatNumberAsTwoDigits(int number)
    {
        if (number < 10)
        {
            String twoDigits = ("0" + number);
            return twoDigits;
        }
        return ("" + number);
    }

    public static String nameFormat(int year, int month, int day)
    {
        if (month == 1)
        {
            return "January " + day + ", " + year;
        } else if (month == 2)
        {
            return "February " + day + ", " + year;
        } else if (month == 3)
        {
            return "March " + day + ", " + year;
        } else if (month == 4)
        {
            return "April " + day + ", " + year;
        } else if (month == 5)
        {
            return "May " + day + ", " + year;
        } else if (month == 6)
        {
            return "June " + day + ", " + year;
        } else if (month == 7)
        {
            return "July " + day + ", " + year;
        } else if (month == 8)
        {
            return "August " + day + ", " + year;
        } else if (month == 9)
        {
            return "September " + day + ", " + year;
        } else if (month == 10)
        {
            return "October " + day + ", " + year;
        } else if (month == 11)
        {
            return "November " + day + ", " + year;
        } else if (month == 12)
        {
            return "December " + day + ", " + year;
        }
        return "" ;
    }

    public static String slashFormat(int year, int month, int day)
    {
        return(month + "/" + day + "/" + year);
    }

    public static String dashFormat(int year, int month, int day)
    {
        return(year + "-" + month + "-" + day);
    }

    public static void printDate(int year, int month, int day)
    {
        out.println(nameFormat(year, month, day));
        out.println(slashFormat(year, month, day));
        out.println(dashFormat(year, month, day));
        out.println();
    }
}
