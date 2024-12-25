public class PivotInteger2485 {

    public static void main(String[] args) {

    }

    public int pivotInteger(int n) {
        for (int i = 1; i <= n; i++) {
            if (sumFrom1ToX(i) == sumFromXToN(i, n))
                return i;
        }

        return -1;
    }

    public int sumFrom1ToX(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++)
            sum += i;

        return sum;
    }

    public int sumFromXToN(int x, int n) {
        int sum = 0;
        for (int i = x; i <= n; i++)
            sum += i;

        return sum;
    }
}
