public class DivisibleAndNon2894 {

    public static void main(String[] args) {
        differenceOfSums(10, 3);
    }

    static int cnt(int x, int n) {
        int cnt = n / x;
        return cnt * x + cnt * (cnt - 1) * x / 2;// sum of all number <= n divisible by x
    }

    public static int differenceOfSums(int n, int m) {
        int cnt = cnt(m, n);
        return n * (n + 1) / 2 - cnt * 2;
    }
}
