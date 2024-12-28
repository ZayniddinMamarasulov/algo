public class CountPrefix2255 {

    public static void main(String[] args) {

    }

    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String word : words)
            if (s.startsWith(word))
                count++;

        return count;

    }
}
