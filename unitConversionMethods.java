import static java.lang.System.out;
import java.util.Scanner;

public class unitConversionMethods
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("How many gallons? ");
        float howManyGallons = keyboard.nextFloat();

        out.println("How many quarts? ");
        float howManyQuarts = keyboard.nextFloat();

        out.println("How many pints? ");
        float howManyPints = keyboard.nextFloat();

        out.println("How many cups? ");
        float howManyCups = keyboard.nextFloat();

        out.println(howManyGallons + " gallons is this many ounces: " + gallonsToOunces(howManyGallons));
        out.println(howManyQuarts + " quarts is this many ounces: " + quartsToOunces(howManyQuarts));
        out.println(howManyPints + " pints is this many ounces: " + pintsToOunces(howManyPints));
        out.println(howManyCups + " cups is this many ounces: " + cupsToOunces(howManyCups));

        out.println("How many ounces? ");
        float howManyOunces = keyboard.nextFloat();

        out.println(howManyOunces + " ounces is " + ouncesToGallons(howManyOunces) + " gallons.");
        out.println(howManyOunces + " ounces is " + ouncesToQuarts(howManyOunces) + " quarts.");
        out.println(howManyOunces + " ounces is " + ouncesToPints(howManyOunces) + " pints.");
        out.println(howManyOunces + " ounces is " + ouncesToCups(howManyOunces) + " cups.");
    }

    public static float gallonsToOunces(float gallons)
    {
        return gallons * 128F;
    }

    public static float quartsToOunces(float quarts)
    {
        return quarts * 32F;
    }

    public static float pintsToOunces(float pints)
    {
        return pints * 16F;
    }

    public static float cupsToOunces(float cups)
    {
        return cups *8F;
    }

    public static float ouncesToGallons(float ounces)
    {
        return ounces / 128F;
    }

    public static float ouncesToQuarts(float ounces)
    {
        return ounces / 32F;
    }

    public static float ouncesToPints(float ounces)
    {
        return ounces / 16F;
    }

    public static float ouncesToCups(float ounces)
    {
        return ounces / 8F;
    }
}
