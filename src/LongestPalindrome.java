import java.util.*;

public class LongestPalindrome {

    public static void main(String[] args) {
        longestPalindrome("bananas");
    }

    public static int longestPalindrome(String s) {
        char[] input = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int count = 0;

        for (char c : input)
            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            } else
                set.add(c);


        return set.isEmpty() ? count : count + 1;
    }
}
