import static java.lang.System.out;

public class methodExamples
{
    public static void line()
    {
        out.println("|-----------------|");
    }

    public static void spaces()
    {
        out.println("|                 |");
    }

    public static void box()
    {
        line();
        spaces();
        spaces();
        spaces();
        spaces();
    }

    public static void main(String[] args)
    {
        box();
        box();
        box();
        line();
    }
}
