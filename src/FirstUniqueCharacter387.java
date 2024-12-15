import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);


        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}