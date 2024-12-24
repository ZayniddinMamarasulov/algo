public class Sqrt69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        if (x == 1 || x == 0) return x;
        for (int i = 1; i <= x; i++) {
            if (x / i < i) return i - 1;
        }

        return 0;
    }

}
