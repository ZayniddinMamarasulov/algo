import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences884 {

    public static void main(String[] args) {
        uncommonFromSentences("this apple is sweet", "this apple is sour");
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] first = s1.split(" ");
        String[] second = s2.split(" ");

        for (String s : first) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : second) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int k = 0;
        String[] temp = new String[200];

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                temp[k++] = entry.getKey();
            }
        }

        String[] res = new String[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp[i];
        }

        return res;
    }
}
