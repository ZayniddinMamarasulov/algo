public class DifferenceBetweenElement2535 {

    public static void main(String[] args) {

    }

    public int differenceOfSum(int[] nums) {
        int allSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            allSum += nums[i];
            digitSum += sumOfDigits(nums[i]);
        }

        return Math.abs(allSum - digitSum);
    }

    public int sumOfDigits(int x) {
        int sum = 0;
        while (x >= 1) {
            sum += x % 10;
            x /= 10;
        }

        return sum;
    }
}
