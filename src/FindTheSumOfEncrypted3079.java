public class FindTheSumOfEncrypted3079 {

    public static void main(String[] args) {
//        sumOfEncryptedInt(new int[]{21, 399, 45});
        sumOfEncryptedInt(new int[]{10, 21, 31});
    }

    public static int sumOfEncryptedInt(int[] nums) {
        int res = 0;

        for (int num : nums)
            if (num < 9)
                res += num;
            else
                res += largeDigit(num);


        return res;
    }

    public static int largeDigit(int x) {
        int maxDigit = x % 10;
        int length = 0;
        while (x >= 1) {
            length++;
            int cur = x % 10;
            if (cur > maxDigit) maxDigit = cur;
            x /= 10;
        }

        int res = 0;
        while (length > 0) {
            res += maxDigit * Math.pow(10, length - 1);
            length--;
        }

        return res;
    }
}
