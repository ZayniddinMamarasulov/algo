public class DivisibleAndNon2894 {

    public static void main(String[] args) {
        differenceOfSums(10, 3);
    }

    public static int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int nonDivisibleSum = 0;
        int allSum = 0;

        for (int i = 1; i <= n; i++) {
            allSum += i;
            if (i % m == 0) divisibleSum += i;
            else nonDivisibleSum += i;
        }

        return nonDivisibleSum - divisibleSum;
    }
}
