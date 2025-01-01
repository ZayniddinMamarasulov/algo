public class FindFirstPalindromic2108 {

    public static void main(String[] args) {
        firstPalindrome(new String[]{});
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words)
            if (isPalindrome(word)) return word;

        return "";
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        return true;
    }
}
