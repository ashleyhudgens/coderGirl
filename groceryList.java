import static java.lang.System.out;
import java.util.Scanner;

public class groceryList {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String itemOne;
        String itemTwo;
        String itemThree;
        int itemOneQuantity;
        int itemTwoQuantity;
        int itemThreeQuantity;
        double itemOnePrice;
        double itemTwoPrice;
        double itemThreePrice;
        double totalCostItemOne;
        double totalCostItemTwo;
        double totalCostItemThree;
        double totalBill;

        out.println("Please list three items on your grocery shopping list.");
        out.println("Item 1: ");
        itemOne = keyboard.nextLine();
        out.println("");

        out.println("Item 2: ");
        itemTwo = keyboard.nextLine();
        out.println("");

        out.println("Item 3: ");
        itemThree = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + itemOne + " ?");
        itemOneQuantity = keyboard.nextInt();
        out.println("");

        out.println("How many " + itemTwo + " ?");
        itemTwoQuantity = keyboard.nextInt();
        out.println("");

        out.println("How many " + itemThree + " ?");
        itemThreeQuantity = keyboard.nextInt();
        out.println("");

        out.println("Now, please enter the price of each item.");
        out.println("");

        out.println("How much does one " + itemOne + " cost?");
        itemOnePrice = keyboard.nextDouble();
        out.println("");

        out.println("How much does one " + itemTwo + " cost?");
        itemTwoPrice = keyboard.nextDouble();
        out.println("");

        out.println("How much does one " + itemThree + " cost?");
        itemThreePrice = keyboard.nextDouble();
        out.println("");

        out.println("Calculating your grocery bill");
        out.println("");
        totalCostItemOne = itemOneQuantity * itemOnePrice;
        totalCostItemTwo = itemTwoQuantity * itemTwoPrice;
        totalCostItemThree = itemThreeQuantity * itemThreePrice;
        totalBill = totalCostItemOne + totalCostItemTwo + totalCostItemThree;

        out.println("Your total bill is " + totalBill);
    }

}
