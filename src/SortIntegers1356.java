import java.util.Arrays;

public class SortIntegers1356 {

    public static void main(String[] args) {
        sortByBits(new int[]{7, 6, 5, 3});
    }

    public static int[] sortByBits(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = Integer.bitCount(arr[j]);
                int y = Integer.bitCount(arr[i]);
                if (x == y) {
                    if (arr[j] < arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else if (x < y) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
