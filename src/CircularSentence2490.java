public class CircularSentence2490 {

    public static void main(String[] args) {
        isCircularSentence("leetcode exercises sound delightful");
    }

    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");

        if (words.length == 1)
            return words[0].charAt(0) == words[0].charAt(words[0].length() - 1);

        for (int i = 0; i < words.length - 1; i++) {
            if (i == words.length - 2)
                if (words[i+1].charAt(words[i+1].length() - 1) != words[0].charAt(0)) return false;
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) return false;
        }

        return true;
    }
}
