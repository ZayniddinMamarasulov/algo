import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveElement {
    public static void main(String[] args) {
//        removeDup(new int[]{3, 2, 2, 3}, 3);
        removeDup(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }

    public static int removeDup(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        System.out.println(nums.length - count);
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
