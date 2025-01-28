import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber260 {

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int k = 0;

        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) res[k++] = i;
            if (k == 2) break;
        }

        return res;
    }
}
