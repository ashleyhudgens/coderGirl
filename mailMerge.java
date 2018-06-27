import static java.lang.System.out;
import java.util.Scanner;

public class mailMerge
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String donorName;
        double donationAmount;
        boolean keepGoing = true;
        String anotherDonor;

        out.println("---Thank You Letters---");

        while (keepGoing == true)
        {
        out.println("Is there a donor? Enter \"quit\" to exit.");
        anotherDonor = keyboard.next();
        if (anotherDonor.equalsIgnoreCase("quit")) {
            keepGoing = false;
        } else {
            out.println("What is the donors name?");
            donorName = keyboard.next();

            out.println("What is the donation amount?");
            donationAmount = keyboard.nextDouble();
                out.println("Dear " + donorName);
                out.println("Thank you for your donation! We rely on donors like you to keep our");
                out.println("organization effective, and you came through for us. Your donation of $" + donationAmount);
                out.println("will help our efforts to make a difference in the world.");
                out.println();
                out.println("As you may know, we are a registered non-profile organization, so your");
                out.println("donation is tax deductible. You may use this letter as a receipt for tax");
                out.println("purposes.");
                out.println();
                out.println("Thank you again for your support!");
                out.println();
                out.println("Sincerely,");
                out.println("Paula Jones");
                out.println("Yourcharity.org");

            }
        }
    }
}
