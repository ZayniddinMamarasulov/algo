import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {

    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++)
            if (selfDivide(i))
                res.add(i);

        return res;
    }

    public static boolean selfDivide(int x) {
        int temp = x;
        while (temp >= 1) {
            int digit = temp % 10;
            if (digit == 0) return false;
            if (x % digit == 0) temp /= 10;
            else return false;
        }

        return true;
    }
}
