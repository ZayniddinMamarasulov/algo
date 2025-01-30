public class Pow50 {

    public static void main(String[] args) {
//        myPow(2.00000, -2147483648);
        myPow(-3, -5);
    }

    public static double myPow(double x, int n) {
        if (n == 0 || x == 1) return 1;
        if (x == -1) return n % 2 == 0 ? 1 : -1;
        if (n >= Integer.MAX_VALUE - 1) return 0;
        if (n <= Integer.MIN_VALUE + 1) return 0;

        double res = x;
        int k = Math.abs(n);

        if (k % 2 == 0) {
            k /= 2;
            while (k > 1) {
                res *= x;
                k--;
            }

            return n > 0 ? res * res : 1 / (res * res);
        } else {

            while (k > 1) {
                res *= x;
                k--;
            }

            return n > 0 ? res : 1 / res;
        }
    }
}
