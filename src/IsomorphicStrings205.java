import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    public static void main(String[] args) {
        isIsomorphic("egg", "add");
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        Map<Character, Character> ssMap = new HashMap<>();

        char[] tt = t.toCharArray();
        Map<Character, Character> ttMap = new HashMap<>();


        for (int i = 0; i < ss.length; i++) {
            if (ssMap.containsKey(ss[i])) {
                if (ssMap.get(ss[i]) != tt[i]) return false;
            } else {
                if (!ttMap.containsKey(tt[i])) {
                    ssMap.put(ss[i], tt[i]);
                    ttMap.put(tt[i], ss[i]);
                } else return false;
            }
        }

        return true;
    }
}
