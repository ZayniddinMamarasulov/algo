import java.util.Arrays;

public class ThirdMaxNum414 {

    public static void main(String[] args) {
        thirdMax(new int[]{2, 2, 3, 1});
    }

    public static int thirdMax(int[] nums) {

        quickSort(nums, 0, nums.length - 1);

        int count = 1;
        if (nums.length < 3) return nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1])
                count++;
            if (count == 3)
                return nums[i];
        }

        return nums[nums.length - 1];
    }


    // QuickSort recursive function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort the elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = (low - 1); // Index for smaller elements

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }
}
