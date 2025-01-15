public class LargestNumber747 {

    public static void main(String[] args) {
        dominantIndex(new int[]{1, 0});
    }

    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int num : nums) {
            if (max != num)
                if (max < num * 2) return -1;
        }


        return maxIndex;
    }
}
