import static java.lang.System.out;

public class basicMethod
{
    public static void monkeys()
    {
        out.println(" little monkey jumping on the bed");
        out.println("One fell off and bumped his head.");
        out.println("Mama called the doctor and the doctor said");
        out.println("No more monkeys jumping on the bed!");
        out.println();
    }

    public static void main(String[] args)
    {
        out.print("4");
        monkeys();
        out.print("3");
        monkeys();
        out.print("2");
        monkeys();
        out.print("1");
        monkeys();
    }
}
