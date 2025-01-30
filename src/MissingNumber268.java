import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {
        bubbleSort(nums);

        if (nums[nums.length - 1] != nums.length) return nums.length;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] + 1 != nums[i]) return nums[i] + 1;
        }

        return 0;
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            bubble(nums);
        }
    }

    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }

}
