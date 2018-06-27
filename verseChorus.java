import static java.lang.System.out;

public class verseChorus
{
    public static void chorus()
    {
        out.println("With a knick-knack paddywhack,");
        out.println("give the dog a bone,");
        out.println("This old man came rolling home.");
        out.println();
    }

    public static void main(String[] args)
    {
        out.println("This old man, he played one.");
        out.println("He played knick-knack on my thumb");
        chorus();

        out.println("This old man, he played two");
        out.println("He played knick-knack on my shoe;");
        chorus();

        out.println("This old man, he played three.");
        out.println("He played knick-knack on my knee;");
        chorus();

        out.println("This old man, he played four.");
        out.println("He played knick-knack on my door;");
        chorus();

        out.println("This old man, he played five.");
        out.println("He played knick-knack on my hive;");
        chorus();

        out.println("This old man, he played six.");
        out.println("He played knick-knack on my sticks;");
        chorus();
    }

}
