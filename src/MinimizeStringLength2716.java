import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength2716 {

    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size();
    }
}
