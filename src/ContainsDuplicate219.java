import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate219 {

    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> windows = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (right - left > k) {
                windows.remove(nums[left]);
                left++;
            }
            if(windows.contains(nums[right])) return true;
            windows.add(nums[right]);
        }
        return false;
    }
}
