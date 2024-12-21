public class ReversePrefix2000 {

    public static void main(String[] args) {
        reversePrefix("abcdefd", 'd');
    }

    public static String reversePrefix(String word, char ch) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            buffer.insert(0, word.charAt(i));

            if (word.charAt(i) == ch) {
                buffer.append(word.substring(i + 1, word.length()));
                return buffer.toString();
            }
        }

        return word;
    }
}
