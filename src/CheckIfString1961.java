public class CheckIfString1961 {

    public static void main(String[] args) {
        isPrefixString("ccccccccc", new String[]{"c", "cc"});
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder builder = new StringBuilder();

        for (String word : words) {
            builder.append(word);

            if (builder.toString().equals(s))
                return true;
        }

        return false;
    }
}
