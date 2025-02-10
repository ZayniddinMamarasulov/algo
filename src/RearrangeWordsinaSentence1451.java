import java.util.*;

public class RearrangeWordsinaSentence1451 {

    public static void main(String[] args) {

    }

    public String arrangeWords(String text) {
        StringBuilder builder = new StringBuilder();

        String[] text1 = text.split(" ");

        Arrays.sort(text1, Comparator.comparingInt(String::length));

        for (int i = 0; i < text1.length; i++) {
            String cur = text1[i];
            String res = i == 0
                    ? (cur.substring(0, 1).toUpperCase() + cur.substring(1, cur.length() - 1).toLowerCase())
                    : cur.toLowerCase();

            builder.append(res);
            if (i != text1.length - 1) builder.append(" ");
        }


        return builder.toString();
    }
}
