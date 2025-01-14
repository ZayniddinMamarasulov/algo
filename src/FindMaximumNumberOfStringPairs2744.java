public class FindMaximumNumberOfStringPairs2744 {

    public static void main(String[] args) {

    }

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (i != j)
                    if (isPair(words[i].toCharArray(), words[j].toCharArray()))
                        count++;
            }
        }

        return count;
    }

    public boolean isPair(char[] a, char[] b) {
        return a[1] == b[0] && b[1] == a[0];
    }
}
