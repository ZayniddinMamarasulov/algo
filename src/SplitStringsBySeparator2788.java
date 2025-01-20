import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplitStringsBySeparator2788 {

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        res.add("one.two.three");
        res.add("four.five");
        res.add("six");
        splitWordsBySeparator(res, '.');
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> res = new ArrayList<>();

        for (String word : words) {
            String[] cur = word.split(String.valueOf("\\" + separator));

            Collections.addAll(res, cur);

            for (String s : cur) if (s != "") res.add(s);
        }

        return res;
    }
}
