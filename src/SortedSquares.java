import java.util.ArrayList;
import java.util.List;

public class SortedSquares {

    public static void main(String[] args) {
        sortedSquares(new int[]{-4, -1, 0, 3, 10});
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] res = new int[nums.length];
        int k = 0;

        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[k++] = (nums[right] * nums[right]);
                right--;
            } else {
                res[k++] = (nums[left] * nums[left]);
                left++;
            }
        }

        return reverse(res);
    }

    public static int[] reverse(int[] validData) {
        for (int i = 0; i < validData.length / 2; i++) {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }

        return validData;
    }
}
