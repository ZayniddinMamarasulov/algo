public class CheckBalancedString3340 {

    public static void main(String[] args) {
        isBalanced("24123");
    }

    public static boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        char[] in = num.toCharArray();

        for (int i = 0; i < in.length; i++) {
            if (i % 2 == 0)
                even += (in[i] - '0');
            else
                odd += (in[i] - '0');
        }

        return even == odd;
    }
}
