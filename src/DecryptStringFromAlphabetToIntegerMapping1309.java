public class DecryptStringFromAlphabetToIntegerMapping1309 {

    public static void main(String[] args) {
        freqAlphabets("10#11#12");
    }

    public static String freqAlphabets(String s) {
        char[] input = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        int k = input.length - 1;

        while (k >= 0) {
            if (input[k] == '#') {
                StringBuilder b = new StringBuilder();
                b.append(input[k - 2]);
                b.append(input[k - 1]);
                builder.append((char) ((Integer.parseInt(b.toString())) + 96));
                k -= 3;
            } else {
                builder.append((char) (input[k] + 48));
                k--;
            }
        }

        return builder.reverse().toString();
    }
}
