import java.util.Stack;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car", "dogs"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "d", "do"}));
//        System.out.println(longestCommonPrefix(new String[]{"", "d", "do"}));
//        System.out.println(longestCommonPrefix(new String[]{"", ""}));
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flower"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        int minStringLength = strs[0].length();
        int minStringIndex = 0;
        int common = 0;

        for (int i = 0; i < strs.length; i++) {
            if (minStringLength > strs[i].length()) {
                minStringLength = strs[i].length();
                minStringIndex = i;
            }
        }

        for (int i = 0; i < minStringLength; i++) {
            for (String word : strs) {
                if (strs[minStringIndex].charAt(i) != word.charAt(i))
                    return word.substring(0, common);
            }
            common = i + 1;
        }

        return strs[minStringIndex];
    }
}
