public class SubtractTheProductAndSum1281 {

    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 1) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }

        return product - sum;
    }
}
