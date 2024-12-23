public class FibonacciNumber509 {

    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n) + fib(n - 1);
    }

}
