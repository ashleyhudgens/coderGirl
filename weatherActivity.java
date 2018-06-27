import static java.lang.System.out;

import java.util.Scanner;

public class weatherActivity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weather;
        String mood;

        out.println("What is the weather like today? Answer: sunny, cloudy or rainy: ");
        weather = keyboard.nextLine();
        out.println();
        out.println("What kind of mood are you in for activities? Answer: exercise, party or quiet: ");
        mood = keyboard.nextLine();
        out.println();

        if (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("cloudy") || weather.equalsIgnoreCase("rainy")) {

            if (weather.equalsIgnoreCase("Sunny")) {
                if (mood.equalsIgnoreCase("exercise")) {
                    out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
                } else if (mood.equalsIgnoreCase("party")) {
                    out.println("For a fun party on a sunny day, look for a street festival.");
                } else if (mood.equalsIgnoreCase("quiet")) {
                    out.println("A sunny day is a beautiful time to sit under a tree and read a book.");
                } else {
                    out.println("invalid mood");
                }
            }

            if (weather.equalsIgnoreCase("cloudy")) {
                if (mood.equalsIgnoreCase("exercise")) {
                    out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
                } else if (mood.equalsIgnoreCase("party")) {
                    out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
                } else if (mood.equalsIgnoreCase("quiet")) {
                    out.println("On a cloudy day, take a camera or paints to sketch the flowers at lakeside.");
                } else {
                    out.println("invalid mood");
                }
            }

            if (weather.equalsIgnoreCase("rainy")) {
                if (mood.equalsIgnoreCase("exercise")) {
                    out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
                } else if (mood.equalsIgnoreCase("party")) {
                    out.println("See if your friends are playing board games to pass a rainy day.");
                } else if (mood.equalsIgnoreCase("quiet")) {
                    out.println("A rainy day is a peaceful time to journal and dream");
                } else {
                    out.println("invalid mood");
                }
            }


        } else {
            out.println("invalid weather");
        }
    }
}
