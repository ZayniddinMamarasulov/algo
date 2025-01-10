import java.util.Arrays;

public class HeightChecker1051 {

    public static void main(String[] args) {
        heightChecker(new int[]{1, 1, 4, 2, 1, 3});
    }

    public static int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        System.arraycopy(heights, 0, sorted, 0, sorted.length);
        Arrays.sort(sorted);

        int count = 0;

        for (int i = 0; i < heights.length; i++)
            if (heights[i] != sorted[i]) count++;

        return count;
    }
}
