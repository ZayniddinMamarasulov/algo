import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharacters1941 {

    // try best approach with xOR

    public static void main(String[] args) {
        areOccurrencesEqual("abacbc");
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 0);

        return map.values().stream().distinct().count() == 1;
    }
}
