import java.util.HashSet;

public class TwoSum1 {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] compliments = {};

        for (int i = 0; i < nums.length; ) {
//            if (compliments.) return [compliments[nums[i]], i];

            compliments[target - nums[i]] = i;
        }

        return compliments;
    }
}
