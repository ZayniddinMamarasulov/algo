public class CountTheDigits2520 {

    public static void main(String[] args) {

    }

    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp >= 1) {
            int digit = temp % 10;
            if (num % digit == 0) count++;
            temp /= 10;
        }

        return count;
    }
}
