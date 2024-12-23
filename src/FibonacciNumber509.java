public class FibonacciNumber509 {

    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n) + fib(n - 1);
    }

}
