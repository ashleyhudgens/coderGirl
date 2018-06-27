import static java.lang.System.out;
import java.util.Scanner;

public class sandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggie = 50;
        int goalForBurger = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        int totalVeggieSold;
        int totalBurgerSold;
        int totalSubSold;
        int totalSoupSold;

        int didNotMakeGoal = 0;

        out.println("Checking Sales Goals:");
        out.println();

        out.println("The sales goal for veggie sandwiches is " + goalForVeggie);
        out.println("How many veggie sandwiches were sold today? ");
        totalVeggieSold = keyboard.nextInt();
        if (totalVeggieSold >= goalForVeggie) {
            out.println("Made goal for veggie.");
        } else {
            out.println("Fell short");
            didNotMakeGoal++;
        }
        out.println();

        out.println("The sales goal for burgers is " + goalForBurger);
        out.println("How many burgers were sold today? ");
        totalBurgerSold = keyboard.nextInt();
        if (totalBurgerSold >= goalForBurger) {
            out.println("Made goal for burgers.");
        } else {
            out.println("Fell short");
            didNotMakeGoal++;
        }
        out.println();

        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today? ");
        totalSubSold = keyboard.nextInt();
        if (totalSubSold >= goalForSubs) {
            out.println("Made goal for subs.");
        } else {
            out.println("Fell short");
            didNotMakeGoal++;
        }
        out.println();

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today? ");
        totalSoupSold = keyboard.nextInt();
        if (totalSoupSold >= goalForSoup) {
            out.println("Made goal for soup.");
        } else {
            out.println("Fell short");
            didNotMakeGoal++;
        }
        out.println();

        if (didNotMakeGoal == 0) {
            out.println("Made goal for everything!");
        } else {
            out.println("Did not meet all goals;");
        }

    }
}
