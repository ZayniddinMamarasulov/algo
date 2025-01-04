public class CountingWords2185 {

    public static void main(String[] args) {

    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words)
            if (word.startsWith(pref)) count++;

        return count;
    }
}
