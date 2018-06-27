import static java.lang.System.out;

public class whileLoopCountByFives
{
    public static void main(String[] args) {


        int number = 0;

        while (number <= 100) {
            number++;
            if (number % 5 == 0)
            {
                out.println(number);
            }
        }
    }
}
