import java.util.ArrayList;
import java.util.List;

public class DecompressRunLength1313 {

    public static void main(String[] args) {
        decompressRLElist(new int[]{1, 2, 3, 4});
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2)
            for (int j = 0; j < nums[i]; j++)
                list.add(nums[i + 1]);

        int[] res = new int[list.size()];
        int k = 0;
        for (Integer item : list) res[k++] = item;

        return res;
    }
}
