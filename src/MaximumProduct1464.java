public class MaximumProduct1464 {
    public static void main(String[] args) {
        maxProduct(new int[]{3, 4, 5, 2});
    }

    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max1Index = -1;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max1) {
                max1 = nums[i];
                max1Index = i;
            }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max2 && i != max1Index)
                max2 = nums[i];

        return (nums[max1Index] - 1) * (max2 - 1);
    }
}
