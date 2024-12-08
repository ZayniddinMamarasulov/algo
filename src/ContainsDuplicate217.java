import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static void main(String[] args)  {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();

        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}
