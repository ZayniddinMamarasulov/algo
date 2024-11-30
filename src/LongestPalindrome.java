import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println("res->" + longestPalindrome("babad"));
//        System.out.println(longestPalindrome("cbbd"));
    }

    public static String expand(String s, int i, int j) {

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i -= 1;
            j += 1;
        }

        return s.substring(i + 1, j);
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        List<String> answer = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String polOdd = expand(s, i, i);
            String polEven = expand(s, i, i + 1);

            answer.add(polEven);
            answer.add(polOdd);
        }

        String res = "";

        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i).length() > res.length())
                res = answer.get(i);
        }

        return res;
    }
}
