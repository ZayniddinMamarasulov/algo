public class MaximumNumberOfWords2114 {

    public static void main(String[] args) {

    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences)
            if (sentence.split(" ").length > max)
                max = sentence.split(" ").length;

        return max;
    }
}
