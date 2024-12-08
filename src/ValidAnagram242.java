import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;

        for (int i = 0; i < t.length(); i++) {
            int offs = t.charAt(i) - 'a';

            if (arr[offs] > 0)
                arr[offs]--;
            else
                return false;
        }

        return true;
    }
}
