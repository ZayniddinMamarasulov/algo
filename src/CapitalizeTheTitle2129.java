import java.util.Arrays;

public class CapitalizeTheTitle2129 {

    public static void main(String[] args) {
        capitalizeTitle("capiTalIze tHe titLe");
    }

    public static String capitalizeTitle(String title) {
        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++)
            words[i] = words[i].length() > 2
                    ? capitalizeFirstLetter(words[i])
                    : lowerAllLetters(words[i]);

        return String.join(" ", words);
    }

    public static String capitalizeFirstLetter(String x) {
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < x.length(); i++)
            buffer.append(i == 0
                    ? Character.toUpperCase(x.charAt(i))
                    : Character.toLowerCase(x.charAt(i))
            );

        return buffer.toString();
    }

    public static String lowerAllLetters(String x) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < x.length(); i++)
            buffer.append(Character.toLowerCase(x.charAt(i)));

        return buffer.toString();
    }
}
