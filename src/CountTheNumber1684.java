public class CountTheNumber1684 {

    public static void main(String[] args) {
        countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (String word : words)
            if (isConsistent(allowed, word)) count++;
        return count;
    }

    public static boolean isConsistent(String allowed, String current) {
        char[] cur = current.toCharArray();

        for (char c : cur) if (!allowed.contains(c + "")) return false;

        return true;
    }
}
