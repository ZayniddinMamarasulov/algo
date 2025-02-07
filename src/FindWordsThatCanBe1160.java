import java.util.Arrays;

public class FindWordsThatCanBe1160 {

    public static void main(String[] args) {
        countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach");
    }

    public static int countCharacters(String[] words, String chars) {
        char[] cArray = chars.toCharArray();
        int[] charsInput = new int[26];
        int count = 0;

        for (char c : cArray) charsInput[c - 97]++;

        for (String word : words) {
            if (canBuild(word, charsInput)) count += word.length();
        }

        return count;
    }

    public static boolean canBuild(String word, int[] curInput) {
        int[] temp = new int[26];
        for (int j = 0; j < word.length(); j++) {
            int cur = word.charAt(j) - 97;
            temp[cur]++;
            if (temp[cur] > curInput[cur]) {
                return false;

            }
        }
        return true;
    }
}
