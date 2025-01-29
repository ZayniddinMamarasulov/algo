public class MinimumSum2106 {

    public static void main(String[] args) {
        minimumSum(2932);
    }

    public static int minimumSum(int num) {
        int[] input = new int[4];
        int pos = 0;
        while (num > 0) {
            input[pos++] = num % 10;
            num /= 10;
        }

        bubbleSort(input);

        return input[0] * 10 + input[3] + input[1] * 10 + input[2];
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            bubble(nums);
        }
    }

    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }
}
