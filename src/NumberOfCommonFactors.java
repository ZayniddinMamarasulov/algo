public class NumberOfCommonFactors {

    public static void main(String[] args) {

    }

    public int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= gcd(a, b); i++) {
            if (a % i == 0 && b % i == 0) count++;
        }

        return count;
    }

    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
