public class DivideAStringIntoGroupsOfSizeK2138 {

    public static void main(String[] args) {
        divideString("abcdefghij", 3, 'x');
    }

    public static String[] divideString(String s, int k, char fill) {
        int len = s.length() % k == 0
                ? (s.length() / k)
                : ((s.length() / k) + 1);
        String[] res = new String[len];

        int cur = 0;

        for (int i = 0; i < s.length(); i += k) {
            StringBuilder builder = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                if (j < s.length()) {
                    builder.append(s.charAt(j));
                } else {
                    builder.append(fill);
                }
            }
            res[cur++] = builder.toString();
        }

        return res;
    }
}
