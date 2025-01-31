import java.util.Arrays;

public class KeepMultiply2154 {

    public static void main(String[] args) {
        findFinalValue(new int[]{5, 3, 6, 1, 12}, 3);
    }

    public static int findFinalValue(int[] nums, int original) {
        int[] arr = new int[1001];

        for (int num : nums) arr[num]++;

        while (original < arr.length) {
            if (arr[original] != 0) original *= 2;
            else return original;
        }

        return original;
    }


}
