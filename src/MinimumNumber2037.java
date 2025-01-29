import java.util.Arrays;

public class MinimumNumber2037 {

    public static void main(String[] args) {
        minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4});
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        bubbleSort(seats);
        bubbleSort(students);
        int count = 0;

        for (int i = 0; i < seats.length; i++)
            count += Math.abs(students[i] - seats[i]);

        return count;
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
