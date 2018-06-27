
import static java.lang.System.out;

public class practiceUppercase
{
    public static void main(String[] args)
    {
        char sentence[] = {'W', 'h', 'y', ' ', 'i', 's', ' ', 'E', 'a', 's', 't', 'e', 'r', ' ', 'i', 'n', ' ', 't', 'h', 'e', ' ', 'S', 'p', 'r', 'i', 'n', 'g', '?'};

        for (int index = 0; index < sentence.length; index++) {

                char upper = sentence[index];
                out.print(Character.toUpperCase(upper));

        }
    }
}
