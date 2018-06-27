import static java.lang.System.out;

public class methodDemo
{
    public static void printMessage(int apples, int oranges)
    {
        out.println("Apples: " + apples);
        out.println("Oranges: " + oranges);
    }
    public static void main(String[] args)
    {
        printMessage(5, 8);
        printMessage(3, 7);
    }
}
