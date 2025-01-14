public class FindNumbersWithEven1295 {

    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (numberOfDigits(num) % 2 == 0) count++;
        }

        return count;
    }

    public int numberOfDigits(int num) {
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }
}
