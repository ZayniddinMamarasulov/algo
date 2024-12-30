import java.util.*;

public class IntersectionOfTwoArrays349 {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set = new HashSet<Integer>();
        HashSet inter = new HashSet<Integer>();
        for (int num : nums1) set.add(num);

        for (int num : nums2)
            if (set.contains(num)) inter.add(num);

        int[] ans = new int[inter.size()];
        int index = 0;

        for (Object i : inter) {
            ans[index++] = (int) i;
        }

        return ans;
    }
}
