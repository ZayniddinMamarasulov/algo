import java.util.ArrayList;

public class SumOfDigits1945 {

    public static void main(String[] args) {
//        getLucky("iiii", 1);
        getLucky("leetcode", 2);
    }

    public static int getLucky(String s, int k) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a' + 1;
            if (cur > 9)
                cur = cur / 10 + cur % 10;
            total += cur;
        }

        k--;

        while (k > 0) {
            int cur = 0;
            while (total > 0) {
                cur += total % 10;
                total /= 10;
            }
            total = cur;
            k--;
        }

        System.out.println(total);

        return total;
    }
}
