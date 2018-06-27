import static java.lang.System.out;


public class leapYear {
    public static void main(String[] args) {
        int testFailures = 0;

        if (isLeapYear(1600) != true) {
            out.println("The year 1600 is a leap year. Try again.");
            testFailures++;
        }

        if (isLeapYear(2000) != true) {
            out.println("The year 2000 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(2400) != true) {
            out.println("The year 2400 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1988) != true) {
            out.println("The year 1988 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1996) != true) {
            out.println("The year 1996 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(2004) != true) {
            out.println("The year 2004 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(4000) != true) {
            out.println("The year 4000 is a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1800) == true) {
            out.println("The year 1800 is not a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1900) == true) {
            out.println("The year 1900 is not a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(2200) == true) {
            out.println("The year 2200 is not a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1987) == true) {
            out.println("The year 1987 is not a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(1999) == true) {
            out.println("The year 1999 is not a leapYear. Try again.");
            testFailures++;
        }

        if (isLeapYear(2006) == true) {
            out.println("The year 2006 is not a leapYear. Try again.");
            testFailures++;
        }

        if (testFailures == 0)
        {
            out.println("YAY ALL TESTS PASSED!!");
        }
        out.println(testFailures);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 4 == 0) && (year % 100 == 0)) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
