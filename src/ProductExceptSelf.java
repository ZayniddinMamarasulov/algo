public class ProductExceptSelf {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 2, 3, 4});
//        productExceptSelf(new int[]{-1, 1, 0, -3, 3});
//        productExceptSelf(new int[]{4, 3, 2, 1, 2});
    }

    public static int[] productExceptSelf(int[] nums) {
        int res = 1;
        int pref[] = new int[nums.length];
        int suf[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res *= nums[i];
            pref[i] = res;
        }
        printArray(pref);

        res = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res *= nums[i];
            suf[i] = res;
        }
        printArray(suf);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                nums[i] = suf[i + 1];
            else if (i == nums.length - 1)
                nums[i] = pref[i - 1];
            else {
                nums[i] = pref[i - 1] * suf[i + 1];
            }
        }
        printArray(nums);

        return nums;
    }

    public static void printArray(int[] res) {
        System.out.println("\n");
        for (int j : res) System.out.print(j + " ");
    }
}
