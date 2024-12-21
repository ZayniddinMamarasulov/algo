public class MinimumTimeToType1974 {

    public static void main(String[] args) {

    }

    public static int minTimeToType(String word) {
        int res = word.length(), prev='a';
        for (char c:word.toCharArray()) {
            int dif = Math.abs(c-prev);
            res += Math.min(dif, 26 - dif);
            prev=c;
        }

        return res;
    }
}
