import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public static void main(String[] args) {


    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int cur = map.getOrDefault(num, 0) + 1;
            if (cur > nums.length / 2) return num;
            map.put(num, cur);
        }

        return 0;
    }
}
