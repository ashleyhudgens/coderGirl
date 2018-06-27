import static java.lang.System.out;

public class temperatures
{
    public static void main(String[] args)
    {
        int temps[][] = new int[4][7];

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        int averageSunday;
        int averageMonday = 0;
        int averageTuesday = 0;
        int averageWednesday = 0;
        int averageThursday = 0;
        int averageFriday = 0;
        int averageSaturday = 0;
        int averageSevenAm = 0;
        int averageThreePm = 0;
        int averageSevenPm = 0;
        int averageThreeAm = 0;
        int averageOverall = 0;


        out.println("Temperature Calculator");
        out.println();
        out.println("The data provided:");
        out.println("7 AM: " + temps[0][0] + ", " + temps[0][1] + ", " + temps[0][2] + ", " + temps[0][3] + ", " + temps[0][4] + ", " + temps[0][5] + ", " + temps[0][6]);
        out.println("3 PM: " + temps[1][0] + ", " + temps[1][1] + ", " + temps[1][2] + ", " + temps[1][3] + ", " + temps[1][4] + ", " + temps[1][5] + ", " + temps[1][6]);
        out.println("7 PM: " + temps[2][0] + ", " + temps[2][1] + ", " + temps[2][2] + ", " + temps[2][3] + ", " + temps[2][4] + ", " + temps[2][5] + ", " + temps[2][6]);
        out.println("3 AM: " + temps[3][0] + ", " + temps[3][1] + ", " + temps[3][2] + ", " + temps[3][3] + ", " + temps[3][4] + ", " + temps[3][5] + ", " + temps[3][6]);
        out.println();
        out.println("Based on that data, the following are the average temperatures for the week: ");
        out.println();

        averageSunday = (temps[0][0] + temps[1][0] + temps[2][0] + temps[3][0]) / 4;
        averageMonday = (temps[0][1] + temps[1][1] + temps[2][1] + temps[3][1]) / 4;
        averageTuesday = (temps[0][2] + temps[1][1] + temps[2][2] + temps[3][2]) / 4;
        averageWednesday = (temps[0][3] + temps[1][3] + temps[2][3] + temps[3][3]) / 4;
        averageThursday = (temps[0][4] + temps[1][4] + temps[2][4] + temps[3][4]) / 4;
        averageFriday = (temps[0][5] + temps[1][5] + temps[2][5] + temps[3][5]) / 4;
        averageSaturday = (temps[0][6] + temps[1][6] + temps[2][6] + temps[3][6]) / 4;

        averageSevenAm = (temps[0][0] + temps[0][1] + temps[0][2] + temps[0][3] + temps[0][4] + temps[0][5] + temps[0][6])  / 7;
        averageThreePm = (temps[1][0] + temps[1][1] + temps[1][2] + temps[1][3] + temps[1][4] + temps[1][5] + temps[1][6]) / 7;
        averageSevenPm = (temps[2][0] + temps[2][1] + temps[2][2] + temps[2][3] + temps[2][4] + temps[2][5] + temps[2][6]) / 7;
        averageThreeAm = (temps[3][0] + temps[3][1] + temps[3][2] + temps[3][3] + temps[3][4] + temps[3][5] + temps[3][6]) / 7;

        averageOverall = (averageSunday + averageMonday + averageTuesday + averageWednesday + averageThursday + averageFriday + averageSaturday) / 7;


        out.println("Sun: " + averageSunday);
        out.println("Mon: " + averageMonday);
        out.println("Tue: " + averageTuesday);
        out.println("Wed: " + averageWednesday);
        out.println("Thu: " + averageThursday);
        out.println("Fri: " + averageFriday);
        out.println("Sat: " + averageSaturday);
        out.println();
        out.println("7 AM: " + averageSevenAm);
        out.println("3 PM: " + averageThreePm);
        out.println("7 PM: " + averageSevenPm);
        out.println("3 AM: " + averageThreeAm);
        out.println();
        out.println("The final average temperature for the week was: ");
        out.println();
        out.println("Overall: " + averageOverall);

    }
}
