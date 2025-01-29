import java.util.ArrayList;
import java.util.List;

public class TargetIndices2089 {

    public List<Integer> targetIndices(int[] nums, int target) {
        int[] x = new int[101];

        for (int num : nums) x[num]++;

        int index = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            if (i != target) index += x[i];
            else {
                for (int j = 0; j < x[i]; j++)
                    list.add(j + index);
                break;
            }
        }

        return list;
    }
}
