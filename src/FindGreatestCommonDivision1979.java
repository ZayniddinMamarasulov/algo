public class FindGreatestCommonDivision1979 {

    public static void main(String[] args) {

    }

    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }

        return gcd(min, max);
    }

    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

}
