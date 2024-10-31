public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int hasZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                hasZero++;
                continue;
            }

            int temp = nums[i];
            nums[i] = nums[i - hasZero];
            nums[i - hasZero] = temp;
        }

        for (int j : nums) System.out.print(j + " ");
    }
}
