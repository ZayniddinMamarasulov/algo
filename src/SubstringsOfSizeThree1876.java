public class SubstringsOfSizeThree1876 {

    public static void main(String[] args) {
//        countGoodSubstrings("xyzzaz");
        countGoodSubstrings("aababcabc");
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;

        int left = 0;
        while (left - 3 < s.length()) {
            if (theSame(s.substring(left, left + 3))) {
                count++;
//                System.out.println(s.substring(left, left + 3) + " - (" + left + ", " + (left + 3) + ")");
            }
            left++;
            if (left + 3 > s.length()) break;
        }

        return count;
    }

    public static boolean theSame(String x) {
        return x.charAt(0) != x.charAt(1)
                && x.charAt(1) != x.charAt(2)
                && x.charAt(2) != x.charAt(0);
    }
}
