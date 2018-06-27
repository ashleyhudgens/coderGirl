import static java.lang.System.out;
import java.util.Scanner;

public class treasureChest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int numberOfBoards = 9;
        float todayPricePerBoard;
        float totalPriceForBoards;
        float priceForLocks;
        float totalAmountPerChest;
        float amountToInvest;
        float numberOfChests;
        float leftOverSilver;

        out.println("Pirate Lady Ching wants to build some locking treasure chests.");
        out.println("The chests are a standard size to fit in the ship's cargo area.");
        out.println("Every chest requires " + numberOfBoards + ".");
        out.println("");

        out.println("What is today's price for boards, in silver pieces? ");
        todayPricePerBoard = keyboard.nextFloat();
        totalPriceForBoards = numberOfBoards * todayPricePerBoard;
        out.println("The cost per chest is " + totalPriceForBoards + " silver pieces for boards.");
        out.println("");

        out.println("Each chest also requires lock hardware.");
        out.println("What is today's price for locks, in silver pieces? ");
        priceForLocks = keyboard.nextFloat();
        out.println("How many silver pieces does Lady Ching wish to invest in building");
        out.println("chests? ");
        amountToInvest = keyboard.nextInt();
        out.println("");

        totalAmountPerChest = totalPriceForBoards + priceForLocks;
        numberOfChests = (int)amountToInvest / (int)totalAmountPerChest;
        leftOverSilver = amountToInvest % totalAmountPerChest;
        out.println("That will pay for the creation of " + numberOfChests + " chests.");
        out.println("Left over silver pieces: " + leftOverSilver);

        out.println(100 % 20);
    }
}
