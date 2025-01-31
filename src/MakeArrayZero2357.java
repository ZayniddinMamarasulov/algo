import java.util.Arrays;

public class MakeArrayZero2357 {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 5, 0, 3, 5}));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        if (nums.length == 1 && nums[0] == 0) return 0;
        if (nums.length == 1 && nums[0] != 0) return 1;

        return calc(nums, count);
    }

    public static int calc(int[] nums, int count) {
        int min = getMin(nums);

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) nums[i] -= min;

        if (min != -1)
            count = calc(nums, ++count);
        return count;
    }

    public static int getMin(int[] nums) {
        int min = -1;

        for (int num : nums)
            if (num > 0) {
                min = num;
                break;
            }

        return min;
    }
}
