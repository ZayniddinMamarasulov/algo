import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence1859 {

    public static void main(String[] args) {

    }

    public static String sortSentence(String s) {
        String[] res = s.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= res.length; i++){
            builder.append(getI(res, i));
            builder.append(" ");
        }

        return builder.toString().trim();
    }

    public static String getI(String[] array, int x) {
        for (String s : array)
            if (s.contains(String.valueOf(x)))
                return s.substring(0, s.length() - 1);

        return "";
    }
}
